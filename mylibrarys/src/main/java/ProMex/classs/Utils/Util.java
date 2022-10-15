package ProMex.classs.Utils;

public class Util {

    public static String pizzuhead = "1767E58093290EEF8795F6DDED6B9225";
    public static String pizzudians = "1B42767E701234D07B82E99B2B46B201739C0B15268073C6F5B3BD80356431EDAAB5927FE277DCCF45923B5D27F79F8F0A698004D1A9082701771824CC17E8533026857F898170DBD5F0CDBDBE2B941DEA44DF061FC56CDA3AE9D7A9D08103B5";
    public static String pizzuli = "730FB0FB7E2BAC7D03559686832246FE7F9FA25AD83AC4B7894724D8232BFFB04F755D0BB891142BDB6A81DBD9CCADB9A5336028B5CA5AEDEF24A329A7118DC3";


    public static String DEc(String aa) {
        String decrypted = "";
        try {
            decrypted = apiii.decrypt(aa);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decrypted;
    }
}

