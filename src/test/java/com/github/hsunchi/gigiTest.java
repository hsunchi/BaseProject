package com.github.hsunchi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class gigiTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        gigi triangle = new gigi(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }


}
