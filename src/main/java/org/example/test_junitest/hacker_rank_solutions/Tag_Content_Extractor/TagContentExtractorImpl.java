package org.example.test_junitest.hacker_rank_solutions.Tag_Content_Extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */

public class TagContentExtractorImpl implements TagContentExtractor {

    @Override
    public String extractContent(String tagInput) {
        StringBuilder result = new StringBuilder();
        Pattern regexp = Pattern.compile("<(.+)>([^<]+)</\\1");
        Matcher matcher = regexp.matcher(tagInput);
        while (matcher.find()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(matcher.group(2));

        }
        if (result.length() > 0) {
            return result.toString();
        }
        return "None";
    }
}
