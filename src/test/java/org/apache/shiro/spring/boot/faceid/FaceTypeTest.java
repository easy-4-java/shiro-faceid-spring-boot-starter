package org.apache.shiro.spring.boot.faceid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link FaceType}.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@DisplayName("FaceType Tests")
class FaceTypeTest {

    @Test
    @DisplayName("values() returns all enum constants")
    void testValues() {
        FaceType[] values = FaceType.values();
        assertThat(values).hasSize(4);
        assertThat(values).contains(FaceType.LIVE, FaceType.IDCARD, FaceType.WATERMARK, FaceType.CERT);
    }

    @Test
    @DisplayName("valueOf() returns correct enum constant")
    void testValueOf() {
        assertThat(FaceType.valueOf("LIVE")).isEqualTo(FaceType.LIVE);
        assertThat(FaceType.valueOf("IDCARD")).isEqualTo(FaceType.IDCARD);
        assertThat(FaceType.valueOf("WATERMARK")).isEqualTo(FaceType.WATERMARK);
        assertThat(FaceType.valueOf("CERT")).isEqualTo(FaceType.CERT);
    }
}
