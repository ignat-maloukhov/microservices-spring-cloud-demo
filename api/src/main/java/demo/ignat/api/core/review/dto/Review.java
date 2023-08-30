package demo.ignat.api.core.review.dto;

public record Review(int id,
                     int productId,
                     String author,
                     String subject,
                     String content,
                     String serviceAddress) {
}
