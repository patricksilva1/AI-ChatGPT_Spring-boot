package dev.patricksilva.aichatgptspring.models;

public record ModelChatRequest(String model, String prompt, double temperature, int max_tokens) {

    public static ModelChatRequest defaultWith(String prompt) {
        return new ModelChatRequest("text-davinci-003", prompt, 0.7, 100000);
    }
}
