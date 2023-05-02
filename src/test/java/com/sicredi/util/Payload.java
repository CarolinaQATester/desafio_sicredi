package com.sicredi.util;

import com.google.gson.JsonObject;

public class Payload {
    public static String getCriacaoPayload(String nome, String cpf, String email, double valor, int parcela, boolean seguro) {
        String payload = "{\n" +
                "  \"nome\": \""+nome+"\",\n" +
                "  \"cpf\": "+cpf+",\n" +
                "  \"email\": \""+email+"\",\n" +
                "  \"valor\": "+valor+",\n" +
                "  \"parcelas\": "+parcela+",\n" +
                "  \"seguro\": "+seguro+"\n" +
                "}";
    return payload;
    }

}
