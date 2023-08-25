package demo.ignat.api.core.review;

public record Review(int id,
                     int productId,
                     String author,
                     String subject,
                     String content,
                     String serviceAddress) {
}
