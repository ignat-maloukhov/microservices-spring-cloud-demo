package demo.ignat.api.core.recommendation;

public record Recommendation(int id,
                             int productId,
                             String author,
                             int rate,
                             String content,
                             String serviceAddress) {
}
