package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/work/wkhtmltopdf/bin/wkhtmltoimage --quality 50  https://www.nowcoder.com d:/work/data/wk_image/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
