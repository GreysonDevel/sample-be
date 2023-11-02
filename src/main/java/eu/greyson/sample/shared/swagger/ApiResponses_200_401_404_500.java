package eu.greyson.sample.shared.swagger;

import eu.greyson.sample.shared.dto.ExceptionDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "SUCCESS"),
        @ApiResponse(responseCode = "401", description = "UNAUTHORIZED",
                content = @Content(
                        schema = @Schema(
                                implementation = ExceptionDto.class
                        )
                )
        ),
        @ApiResponse(responseCode = "404", description = "ID NOT FOUND",
                content = @Content(
                        schema = @Schema(
                                implementation = ExceptionDto.class
                        )
                )
        ),
        @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR",
                content = @Content(
                        schema = @Schema(
                                implementation = ExceptionDto.class
                        )
                )
        ),
})
public @interface ApiResponses_200_401_404_500 {
}
