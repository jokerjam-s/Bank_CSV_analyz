package org.bank.analyzer.paysdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PaysDataCSVParser {
    static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static final String CSV_DELIMETER = ",";

    private static PaysData parsePaysDataFromCsv(final String dataCsv, String delimeter) {
        String[] strings = dataCsv.split(delimeter);

        PaysData paysData = new PaysData(
                LocalDate.parse(strings[0], DATE_PATTERN),
                Double.parseDouble(strings[1]),
                strings[2]
        );

        return paysData;
    }

    public static List<PaysData> parseLinesPaysDataCsv(final List<String> lines) {
        List<PaysData> data = new ArrayList<>();

        for (String s : lines) {
            data.add(parsePaysDataFromCsv(s, CSV_DELIMETER));
        }

        return data;
    }

}
