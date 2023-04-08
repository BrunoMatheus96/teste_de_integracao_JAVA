package support.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
public class Pet {
    @Builder.Default
    private int id = 2;
    @Builder.Default
    private String name = "Panthro";
    //Classe foi criada pq existem elementos dentro desse campo np Swagger
    @Builder.Default
    private Category category = new Category();
    @Builder.Default
    private String status = "available";
    //Foi criada pois existe uma lista no body do swagger
    @Builder.Default
    private List<String> photoUrls = Arrays.asList("url1", "url2");

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Category {
        @Builder.Default
        private int id = 2;
        @Builder.Default
        private String name = "Cats";
    }


}
