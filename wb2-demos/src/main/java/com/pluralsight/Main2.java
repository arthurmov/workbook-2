package com.pluralsight;

public class Main2 {

    public static void main(String[] args) {

        String trackingCode = "USA-12981-Y-22";

        char hasShipped = trackingCode.charAt(10);
        // hasShipped contains 'Y'

        //

        String productCode = "ACME-12213";
        String productCode2 = "ACME-29342";
        String productCode3 = "STANDARD-43203";
        String productCode4 = "STANDARD-59343";

        int dashPosition = productCode.indexOf("-");
        // dashPosition contains 4

        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
        // vendor contains ACME
        // productNum contains 12213

        //

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        // cities is an array containing 3 strings
        // [0] is Dallas, [1] is Ft. Worth, [2] is Austin

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
    }
}
