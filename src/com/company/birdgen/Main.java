//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company.birdgen;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import javax.imageio.ImageIO;

public class Main {
    public static Color black = new Color(0, 0, 0); ////
    public static Color darkBrown = new Color(173, 60, 46); ////
    public static Color darkerBrown = new Color(81, 49, 30); ////
    public static Color legBrown = new Color(81, 49, 31); ////
    public static Color lighterBrown = new Color(229, 131, 76); ////
    public static Color creme = new Color(226, 179, 136); ////
    public static Color grey = new Color(131, 131, 131);
    public static Color lighterGrey = new Color(217, 217, 217); ////
    public static Color transparent = new Color(0, 0, 0, 0);

    public Main() {
    }

    public static void main(String[] args) throws IOException {
//        for(int i = 0; i < 1; ++i) {
//            Image smallImage = createRandomImage(18, 18);
//            BufferedImage newImage = toBufferedImage(smallImage.getScaledInstance(2160, 2160, 1));
//            saveFinal(newImage);
//        }

          //repaintColoredPixelsInFile();
          paintBackground();
//        paintBirdPart1();
//        paintBirdPart2();
//        paintBirdPart3();
//        paintBirdPart4();
//        paintBirdPart5();
//        paintBirdPart6();
//        paintBirdPart7();
//        paintBirdPart8();
    }

    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage)img;
        } else {
            BufferedImage bimage = new BufferedImage(img.getWidth((ImageObserver)null), img.getHeight((ImageObserver)null), 2);
            Graphics2D bGr = bimage.createGraphics();
            bGr.drawImage(img, 0, 0, (ImageObserver)null);
            bGr.dispose();
            return bimage;
        }
    }


    public static void repaintColoredPixelsInFile() throws IOException {
        BufferedImage startingImg = ImageIO.read(new File("E:\\generative-art-nft\\assets\\Forehead\\0.png"));
        int counter = 1;
        for (int i = 0; i < 5; i++) {
            int randomColor = makeRandomColor().getRGB();
            for (int y = 0; y < startingImg.getHeight(); y++) {
                for (int x = 0; x < startingImg.getWidth(); x++) {
                    if (!isTransparent(x,y,startingImg))
                        startingImg.setRGB(x, y, randomColor);
                }
            }
            File outputfile = new File("E:\\generative-art-nft\\assets\\Forehead\\" + counter + ".png");

            ImageIO.write(startingImg, "png", outputfile);
            counter++;
        }


    }

    public static void paintBirdPart1() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(3, 2, darkBrown.getRGB());
        startingImg.setRGB(4, 2, darkBrown.getRGB());
        startingImg.setRGB(5, 2, darkBrown.getRGB());
        startingImg.setRGB(6, 2, darkBrown.getRGB());
        startingImg.setRGB(7, 2, darkBrown.getRGB());
        startingImg.setRGB(3, 3, darkBrown.getRGB());
        startingImg.setRGB(7, 3, darkBrown.getRGB());
        startingImg.setRGB(9, 3, darkBrown.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 1 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart2() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(3, 1, darkerBrown.getRGB());
        startingImg.setRGB(4, 1, darkerBrown.getRGB());
        startingImg.setRGB(5, 1, darkerBrown.getRGB());
        startingImg.setRGB(6, 1, darkerBrown.getRGB());
        startingImg.setRGB(7, 1, darkerBrown.getRGB());
        startingImg.setRGB(2, 2, darkerBrown.getRGB());
        startingImg.setRGB(8, 2, darkerBrown.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 2 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart3() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(1, 3, black.getRGB());
        startingImg.setRGB(2, 3, black.getRGB());
        startingImg.setRGB(4, 3, black.getRGB());
        startingImg.setRGB(10, 4, black.getRGB());
        startingImg.setRGB(11, 5, black.getRGB());
        startingImg.setRGB(2, 6, black.getRGB());
        startingImg.setRGB(12, 6, black.getRGB());
        startingImg.setRGB(3, 7, black.getRGB());
        startingImg.setRGB(13, 7, black.getRGB());
        startingImg.setRGB(3, 8, black.getRGB());
        startingImg.setRGB(14, 8, black.getRGB());
        startingImg.setRGB(3, 9, black.getRGB());
        startingImg.setRGB(15, 9, black.getRGB());
        startingImg.setRGB(4, 10, black.getRGB());
        startingImg.setRGB(14, 10, black.getRGB());
        startingImg.setRGB(16, 10, black.getRGB());
        startingImg.setRGB(5, 11, black.getRGB());
        startingImg.setRGB(14, 11, black.getRGB());
        startingImg.setRGB(6, 12, black.getRGB());
        startingImg.setRGB(13, 12, black.getRGB());
        startingImg.setRGB(7, 13, black.getRGB());
        startingImg.setRGB(8, 13, black.getRGB());
        startingImg.setRGB(9, 13, black.getRGB());
        startingImg.setRGB(10, 13, black.getRGB());
        startingImg.setRGB(11, 13, black.getRGB());
        startingImg.setRGB(12, 13, black.getRGB());
        startingImg.setRGB(6, 14, black.getRGB());
        startingImg.setRGB(7, 14, black.getRGB());
        startingImg.setRGB(3, 15, black.getRGB());
        startingImg.setRGB(4, 15, black.getRGB());
        startingImg.setRGB(5, 15, black.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 3 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart4() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(8, 3, lighterBrown.getRGB());
        startingImg.setRGB(5, 4, lighterBrown.getRGB());
        startingImg.setRGB(7, 4, lighterBrown.getRGB());
        startingImg.setRGB(8, 4, lighterBrown.getRGB());
        startingImg.setRGB(9, 4, lighterBrown.getRGB());
        startingImg.setRGB(6, 5, lighterBrown.getRGB());
        startingImg.setRGB(7, 5, lighterBrown.getRGB());
        startingImg.setRGB(8, 5, lighterBrown.getRGB());
        startingImg.setRGB(9, 5, lighterBrown.getRGB());
        startingImg.setRGB(6, 6, lighterBrown.getRGB());
        startingImg.setRGB(7, 6, lighterBrown.getRGB());
        startingImg.setRGB(10, 6, lighterBrown.getRGB());
        startingImg.setRGB(7, 7, lighterBrown.getRGB());
        startingImg.setRGB(8, 7, lighterBrown.getRGB());
        startingImg.setRGB(9, 7, lighterBrown.getRGB());
        startingImg.setRGB(11, 7, lighterBrown.getRGB());
        startingImg.setRGB(12, 7, lighterBrown.getRGB());
        startingImg.setRGB(7, 8, lighterBrown.getRGB());
        startingImg.setRGB(10, 8, lighterBrown.getRGB());
        startingImg.setRGB(11, 8, lighterBrown.getRGB());
        startingImg.setRGB(12, 8, lighterBrown.getRGB());
        startingImg.setRGB(13, 8, lighterBrown.getRGB());
        startingImg.setRGB(8, 9, lighterBrown.getRGB());
        startingImg.setRGB(9, 9, lighterBrown.getRGB());
        startingImg.setRGB(10, 9, lighterBrown.getRGB());
        startingImg.setRGB(11, 9, lighterBrown.getRGB());
        startingImg.setRGB(12, 9, lighterBrown.getRGB());
        startingImg.setRGB(13, 9, lighterBrown.getRGB());
        startingImg.setRGB(14, 9, lighterBrown.getRGB());
        startingImg.setRGB(10, 10, lighterBrown.getRGB());
        startingImg.setRGB(11, 10, lighterBrown.getRGB());
        startingImg.setRGB(12, 10, lighterBrown.getRGB());
        startingImg.setRGB(13, 10, lighterBrown.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 4 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart5() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(5, 3, lighterGrey.getRGB());
        startingImg.setRGB(6, 3, lighterGrey.getRGB());


        File outputfile = new File("E:\\generative-art-nft\\" + 5 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart6() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(10, 14, legBrown.getRGB());
        startingImg.setRGB(9, 15, legBrown.getRGB());
        startingImg.setRGB(6, 16, legBrown.getRGB());
        startingImg.setRGB(7, 16, legBrown.getRGB());
        startingImg.setRGB(8, 16, legBrown.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 6 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart7() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(3, 5, creme.getRGB());
        startingImg.setRGB(4, 5, creme.getRGB());
        startingImg.setRGB(3, 6, creme.getRGB());
        startingImg.setRGB(4, 6, creme.getRGB());
        startingImg.setRGB(5, 6, creme.getRGB());
        startingImg.setRGB(4, 7, creme.getRGB());
        startingImg.setRGB(5, 7, creme.getRGB());
        startingImg.setRGB(4, 8, creme.getRGB());
        startingImg.setRGB(5, 8, creme.getRGB());
        startingImg.setRGB(4, 9, creme.getRGB());
        startingImg.setRGB(5, 9, creme.getRGB());
        startingImg.setRGB(6, 9, creme.getRGB());
        startingImg.setRGB(5, 10, creme.getRGB());
        startingImg.setRGB(6, 10, creme.getRGB());
        startingImg.setRGB(7, 10, creme.getRGB());
        startingImg.setRGB(6, 11, creme.getRGB());
        startingImg.setRGB(7, 11, creme.getRGB());
        startingImg.setRGB(8, 11, creme.getRGB());
        startingImg.setRGB(9, 11, creme.getRGB());
        startingImg.setRGB(7, 12, creme.getRGB());
        startingImg.setRGB(8, 12, creme.getRGB());
        startingImg.setRGB(9, 12, creme.getRGB());
        startingImg.setRGB(10, 12, creme.getRGB());
        startingImg.setRGB(11, 12, creme.getRGB());
        startingImg.setRGB(12, 12, creme.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 7 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBirdPart8() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(2, 4, grey.getRGB());
        startingImg.setRGB(3, 4, grey.getRGB());
        startingImg.setRGB(4, 4, grey.getRGB());
        startingImg.setRGB(6, 4, grey.getRGB());
        startingImg.setRGB(2, 5, grey.getRGB());
        startingImg.setRGB(5, 5, grey.getRGB());
        startingImg.setRGB(10, 5, grey.getRGB());
        startingImg.setRGB(8, 6, grey.getRGB());
        startingImg.setRGB(9, 6, grey.getRGB());
        startingImg.setRGB(11, 6, grey.getRGB());
        startingImg.setRGB(6, 7, grey.getRGB());
        startingImg.setRGB(10, 7, grey.getRGB());
        startingImg.setRGB(6, 8, grey.getRGB());
        startingImg.setRGB(8, 8, grey.getRGB());
        startingImg.setRGB(9, 8, grey.getRGB());
        startingImg.setRGB(7, 9, grey.getRGB());
        startingImg.setRGB(8, 10, grey.getRGB());
        startingImg.setRGB(9, 10, grey.getRGB());
        startingImg.setRGB(10, 11, grey.getRGB());
        startingImg.setRGB(11, 11, grey.getRGB());
        startingImg.setRGB(12, 11, grey.getRGB());
        startingImg.setRGB(13, 11, grey.getRGB());

        File outputfile = new File("E:\\generative-art-nft\\" + 8 + ".png");
        BufferedImage newImage = toBufferedImage(startingImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImage, "png", outputfile);

    }

    public static void paintBackground() throws IOException {
        BufferedImage startingImg = new BufferedImage(18, 18, 6);
        BufferedImage bgImg = new BufferedImage(18, 18, 6);

        startingImg.setRGB(3, 1, darkerBrown.getRGB());
        startingImg.setRGB(4, 1, darkerBrown.getRGB());
        startingImg.setRGB(5, 1, darkerBrown.getRGB());
        startingImg.setRGB(6, 1, darkerBrown.getRGB());
        startingImg.setRGB(7, 1, darkerBrown.getRGB());
        startingImg.setRGB(2, 2, darkerBrown.getRGB());
        startingImg.setRGB(3, 2, darkBrown.getRGB());
        startingImg.setRGB(4, 2, darkBrown.getRGB());
        startingImg.setRGB(5, 2, darkBrown.getRGB());
        startingImg.setRGB(6, 2, darkBrown.getRGB());
        startingImg.setRGB(7, 2, darkBrown.getRGB());
        startingImg.setRGB(8, 2, darkerBrown.getRGB());
        startingImg.setRGB(1, 3, black.getRGB());
        startingImg.setRGB(2, 3, black.getRGB());
        startingImg.setRGB(3, 3, darkBrown.getRGB());
        startingImg.setRGB(4, 3, black.getRGB());
        startingImg.setRGB(5, 3, lighterGrey.getRGB());
        startingImg.setRGB(6, 3, lighterGrey.getRGB());
        startingImg.setRGB(7, 3, darkBrown.getRGB());
        startingImg.setRGB(8, 3, lighterBrown.getRGB());
        startingImg.setRGB(9, 3, darkBrown.getRGB());
        startingImg.setRGB(2, 4, grey.getRGB());
        startingImg.setRGB(3, 4, grey.getRGB());
        startingImg.setRGB(4, 4, grey.getRGB());
        startingImg.setRGB(5, 4, lighterBrown.getRGB());
        startingImg.setRGB(6, 4, grey.getRGB());
        startingImg.setRGB(7, 4, lighterBrown.getRGB());
        startingImg.setRGB(8, 4, lighterBrown.getRGB());
        startingImg.setRGB(9, 4, lighterBrown.getRGB());
        startingImg.setRGB(10, 4, black.getRGB());
        startingImg.setRGB(2, 5, grey.getRGB());
        startingImg.setRGB(3, 5, creme.getRGB());
        startingImg.setRGB(4, 5, creme.getRGB());
        startingImg.setRGB(5, 5, grey.getRGB());
        startingImg.setRGB(6, 5, lighterBrown.getRGB());
        startingImg.setRGB(7, 5, lighterBrown.getRGB());
        startingImg.setRGB(8, 5, lighterBrown.getRGB());
        startingImg.setRGB(9, 5, lighterBrown.getRGB());
        startingImg.setRGB(10, 5, grey.getRGB());
        startingImg.setRGB(11, 5, black.getRGB());
        startingImg.setRGB(2, 6, black.getRGB());
        startingImg.setRGB(3, 6, creme.getRGB());
        startingImg.setRGB(4, 6, creme.getRGB());
        startingImg.setRGB(5, 6, creme.getRGB());
        startingImg.setRGB(6, 6, lighterBrown.getRGB());
        startingImg.setRGB(7, 6, lighterBrown.getRGB());
        startingImg.setRGB(8, 6, grey.getRGB());
        startingImg.setRGB(9, 6, grey.getRGB());
        startingImg.setRGB(10, 6, lighterBrown.getRGB());
        startingImg.setRGB(11, 6, grey.getRGB());
        startingImg.setRGB(12, 6, black.getRGB());
        startingImg.setRGB(3, 7, black.getRGB());
        startingImg.setRGB(4, 7, creme.getRGB());
        startingImg.setRGB(5, 7, creme.getRGB());
        startingImg.setRGB(6, 7, grey.getRGB());
        startingImg.setRGB(7, 7, lighterBrown.getRGB());
        startingImg.setRGB(8, 7, lighterBrown.getRGB());
        startingImg.setRGB(9, 7, lighterBrown.getRGB());
        startingImg.setRGB(10, 7, grey.getRGB());
        startingImg.setRGB(11, 7, lighterBrown.getRGB());
        startingImg.setRGB(12, 7, lighterBrown.getRGB());
        startingImg.setRGB(13, 7, black.getRGB());
        startingImg.setRGB(3, 8, black.getRGB());
        startingImg.setRGB(4, 8, creme.getRGB());
        startingImg.setRGB(5, 8, creme.getRGB());
        startingImg.setRGB(6, 8, grey.getRGB());
        startingImg.setRGB(7, 8, lighterBrown.getRGB());
        startingImg.setRGB(8, 8, grey.getRGB());
        startingImg.setRGB(9, 8, grey.getRGB());
        startingImg.setRGB(10, 8, lighterBrown.getRGB());
        startingImg.setRGB(11, 8, lighterBrown.getRGB());
        startingImg.setRGB(12, 8, lighterBrown.getRGB());
        startingImg.setRGB(13, 8, lighterBrown.getRGB());
        startingImg.setRGB(14, 8, black.getRGB());
        startingImg.setRGB(3, 9, black.getRGB());
        startingImg.setRGB(4, 9, creme.getRGB());
        startingImg.setRGB(5, 9, creme.getRGB());
        startingImg.setRGB(6, 9, creme.getRGB());
        startingImg.setRGB(7, 9, grey.getRGB());
        startingImg.setRGB(8, 9, lighterBrown.getRGB());
        startingImg.setRGB(9, 9, lighterBrown.getRGB());
        startingImg.setRGB(10, 9, lighterBrown.getRGB());
        startingImg.setRGB(11, 9, lighterBrown.getRGB());
        startingImg.setRGB(12, 9, lighterBrown.getRGB());
        startingImg.setRGB(13, 9, lighterBrown.getRGB());
        startingImg.setRGB(14, 9, lighterBrown.getRGB());
        startingImg.setRGB(15, 9, black.getRGB());
        startingImg.setRGB(4, 10, black.getRGB());
        startingImg.setRGB(5, 10, creme.getRGB());
        startingImg.setRGB(6, 10, creme.getRGB());
        startingImg.setRGB(7, 10, creme.getRGB());
        startingImg.setRGB(8, 10, grey.getRGB());
        startingImg.setRGB(9, 10, grey.getRGB());
        startingImg.setRGB(10, 10, lighterBrown.getRGB());
        startingImg.setRGB(11, 10, lighterBrown.getRGB());
        startingImg.setRGB(12, 10, lighterBrown.getRGB());
        startingImg.setRGB(13, 10, lighterBrown.getRGB());
        startingImg.setRGB(14, 10, black.getRGB());
        startingImg.setRGB(16, 10, black.getRGB());
        startingImg.setRGB(5, 11, black.getRGB());
        startingImg.setRGB(6, 11, creme.getRGB());
        startingImg.setRGB(7, 11, creme.getRGB());
        startingImg.setRGB(8, 11, creme.getRGB());
        startingImg.setRGB(9, 11, creme.getRGB());
        startingImg.setRGB(10, 11, grey.getRGB());
        startingImg.setRGB(11, 11, grey.getRGB());
        startingImg.setRGB(12, 11, grey.getRGB());
        startingImg.setRGB(13, 11, grey.getRGB());
        startingImg.setRGB(14, 11, black.getRGB());
        startingImg.setRGB(6, 12, black.getRGB());
        startingImg.setRGB(7, 12, creme.getRGB());
        startingImg.setRGB(8, 12, creme.getRGB());
        startingImg.setRGB(9, 12, creme.getRGB());
        startingImg.setRGB(10, 12, creme.getRGB());
        startingImg.setRGB(11, 12, creme.getRGB());
        startingImg.setRGB(12, 12, creme.getRGB());
        startingImg.setRGB(13, 12, black.getRGB());
        startingImg.setRGB(7, 13, black.getRGB());
        startingImg.setRGB(8, 13, black.getRGB());
        startingImg.setRGB(9, 13, black.getRGB());
        startingImg.setRGB(10, 13, black.getRGB());
        startingImg.setRGB(11, 13, black.getRGB());
        startingImg.setRGB(12, 13, black.getRGB());
        startingImg.setRGB(6, 14, black.getRGB());
        startingImg.setRGB(7, 14, black.getRGB());
        startingImg.setRGB(10, 14, legBrown.getRGB());
        startingImg.setRGB(3, 15, black.getRGB());
        startingImg.setRGB(4, 15, black.getRGB());
        startingImg.setRGB(5, 15, black.getRGB());
        startingImg.setRGB(9, 15, legBrown.getRGB());
        startingImg.setRGB(6, 16, legBrown.getRGB());
        startingImg.setRGB(7, 16, legBrown.getRGB());
        startingImg.setRGB(8, 16, legBrown.getRGB());
        Color backgroundColor = makeRandomColor();

        for(int j = 0; j < startingImg.getHeight(); ++j) {
            for(int i = 0; i < startingImg.getWidth(); ++i) {
                if (isTransparent(i, j, startingImg)) {
                    bgImg.setRGB(i, j, backgroundColor.getRGB());
                }
            }
        }

        File outputfile = new File("E:\\generative-art-nft\\" + 9 + ".png");
        BufferedImage newImg = toBufferedImage(bgImg.getScaledInstance(2160, 2160, 1));
        ImageIO.write(newImg, "png", outputfile);
    }

    public static BufferedImage createRandomImage(int width, int height) {
        BufferedImage startingImg = new BufferedImage(width, height, 6);
        startingImg.setRGB(3, 1, darkerBrown.getRGB());
        startingImg.setRGB(4, 1, darkerBrown.getRGB());
        startingImg.setRGB(5, 1, darkerBrown.getRGB());
        startingImg.setRGB(6, 1, darkerBrown.getRGB());
        startingImg.setRGB(7, 1, darkerBrown.getRGB());
        startingImg.setRGB(2, 2, darkerBrown.getRGB());
        startingImg.setRGB(3, 2, darkBrown.getRGB());
        startingImg.setRGB(4, 2, darkBrown.getRGB());
        startingImg.setRGB(5, 2, darkBrown.getRGB());
        startingImg.setRGB(6, 2, darkBrown.getRGB());
        startingImg.setRGB(7, 2, darkBrown.getRGB());
        startingImg.setRGB(8, 2, darkerBrown.getRGB());
        startingImg.setRGB(1, 3, black.getRGB());
        startingImg.setRGB(2, 3, black.getRGB());
        startingImg.setRGB(3, 3, darkBrown.getRGB());
        startingImg.setRGB(4, 3, black.getRGB());
        startingImg.setRGB(5, 3, lighterGrey.getRGB());
        startingImg.setRGB(6, 3, lighterGrey.getRGB());
        startingImg.setRGB(7, 3, darkBrown.getRGB());
        startingImg.setRGB(8, 3, lighterBrown.getRGB());
        startingImg.setRGB(9, 3, darkBrown.getRGB());
        startingImg.setRGB(2, 4, grey.getRGB());
        startingImg.setRGB(3, 4, grey.getRGB());
        startingImg.setRGB(4, 4, grey.getRGB());
        startingImg.setRGB(5, 4, lighterBrown.getRGB());
        startingImg.setRGB(6, 4, grey.getRGB());
        startingImg.setRGB(7, 4, lighterBrown.getRGB());
        startingImg.setRGB(8, 4, lighterBrown.getRGB());
        startingImg.setRGB(9, 4, lighterBrown.getRGB());
        startingImg.setRGB(10, 4, black.getRGB());
        startingImg.setRGB(2, 5, grey.getRGB());
        startingImg.setRGB(3, 5, creme.getRGB());
        startingImg.setRGB(4, 5, creme.getRGB());
        startingImg.setRGB(5, 5, grey.getRGB());
        startingImg.setRGB(6, 5, lighterBrown.getRGB());
        startingImg.setRGB(7, 5, lighterBrown.getRGB());
        startingImg.setRGB(8, 5, lighterBrown.getRGB());
        startingImg.setRGB(9, 5, lighterBrown.getRGB());
        startingImg.setRGB(10, 5, grey.getRGB());
        startingImg.setRGB(11, 5, black.getRGB());
        startingImg.setRGB(2, 6, black.getRGB());
        startingImg.setRGB(3, 6, creme.getRGB());
        startingImg.setRGB(4, 6, creme.getRGB());
        startingImg.setRGB(5, 6, creme.getRGB());
        startingImg.setRGB(6, 6, lighterBrown.getRGB());
        startingImg.setRGB(7, 6, lighterBrown.getRGB());
        startingImg.setRGB(8, 6, grey.getRGB());
        startingImg.setRGB(9, 6, grey.getRGB());
        startingImg.setRGB(10, 6, lighterBrown.getRGB());
        startingImg.setRGB(11, 6, grey.getRGB());
        startingImg.setRGB(12, 6, black.getRGB());
        startingImg.setRGB(3, 7, black.getRGB());
        startingImg.setRGB(4, 7, creme.getRGB());
        startingImg.setRGB(5, 7, creme.getRGB());
        startingImg.setRGB(6, 7, grey.getRGB());
        startingImg.setRGB(7, 7, lighterBrown.getRGB());
        startingImg.setRGB(8, 7, lighterBrown.getRGB());
        startingImg.setRGB(9, 7, lighterBrown.getRGB());
        startingImg.setRGB(10, 7, grey.getRGB());
        startingImg.setRGB(11, 7, lighterBrown.getRGB());
        startingImg.setRGB(12, 7, lighterBrown.getRGB());
        startingImg.setRGB(13, 7, black.getRGB());
        startingImg.setRGB(3, 8, black.getRGB());
        startingImg.setRGB(4, 8, creme.getRGB());
        startingImg.setRGB(5, 8, creme.getRGB());
        startingImg.setRGB(6, 8, grey.getRGB());
        startingImg.setRGB(7, 8, lighterBrown.getRGB());
        startingImg.setRGB(8, 8, grey.getRGB());
        startingImg.setRGB(9, 8, grey.getRGB());
        startingImg.setRGB(10, 8, lighterBrown.getRGB());
        startingImg.setRGB(11, 8, lighterBrown.getRGB());
        startingImg.setRGB(12, 8, lighterBrown.getRGB());
        startingImg.setRGB(13, 8, lighterBrown.getRGB());
        startingImg.setRGB(14, 8, black.getRGB());
        startingImg.setRGB(3, 9, black.getRGB());
        startingImg.setRGB(4, 9, creme.getRGB());
        startingImg.setRGB(5, 9, creme.getRGB());
        startingImg.setRGB(6, 9, creme.getRGB());
        startingImg.setRGB(7, 9, grey.getRGB());
        startingImg.setRGB(8, 9, lighterBrown.getRGB());
        startingImg.setRGB(9, 9, lighterBrown.getRGB());
        startingImg.setRGB(10, 9, lighterBrown.getRGB());
        startingImg.setRGB(11, 9, lighterBrown.getRGB());
        startingImg.setRGB(12, 9, lighterBrown.getRGB());
        startingImg.setRGB(13, 9, lighterBrown.getRGB());
        startingImg.setRGB(14, 9, lighterBrown.getRGB());
        startingImg.setRGB(15, 9, black.getRGB());
        startingImg.setRGB(4, 10, black.getRGB());
        startingImg.setRGB(5, 10, creme.getRGB());
        startingImg.setRGB(6, 10, creme.getRGB());
        startingImg.setRGB(7, 10, creme.getRGB());
        startingImg.setRGB(8, 10, grey.getRGB());
        startingImg.setRGB(9, 10, grey.getRGB());
        startingImg.setRGB(10, 10, lighterBrown.getRGB());
        startingImg.setRGB(11, 10, lighterBrown.getRGB());
        startingImg.setRGB(12, 10, lighterBrown.getRGB());
        startingImg.setRGB(13, 10, lighterBrown.getRGB());
        startingImg.setRGB(14, 10, black.getRGB());
        startingImg.setRGB(16, 10, black.getRGB());
        startingImg.setRGB(5, 11, black.getRGB());
        startingImg.setRGB(6, 11, creme.getRGB());
        startingImg.setRGB(7, 11, creme.getRGB());
        startingImg.setRGB(8, 11, creme.getRGB());
        startingImg.setRGB(9, 11, creme.getRGB());
        startingImg.setRGB(10, 11, grey.getRGB());
        startingImg.setRGB(11, 11, grey.getRGB());
        startingImg.setRGB(12, 11, grey.getRGB());
        startingImg.setRGB(13, 11, grey.getRGB());
        startingImg.setRGB(14, 11, black.getRGB());
        startingImg.setRGB(6, 12, black.getRGB());
        startingImg.setRGB(7, 12, creme.getRGB());
        startingImg.setRGB(8, 12, creme.getRGB());
        startingImg.setRGB(9, 12, creme.getRGB());
        startingImg.setRGB(10, 12, creme.getRGB());
        startingImg.setRGB(11, 12, creme.getRGB());
        startingImg.setRGB(12, 12, creme.getRGB());
        startingImg.setRGB(13, 12, black.getRGB());
        startingImg.setRGB(7, 13, black.getRGB());
        startingImg.setRGB(8, 13, black.getRGB());
        startingImg.setRGB(9, 13, black.getRGB());
        startingImg.setRGB(10, 13, black.getRGB());
        startingImg.setRGB(11, 13, black.getRGB());
        startingImg.setRGB(12, 13, black.getRGB());
        startingImg.setRGB(6, 14, black.getRGB());
        startingImg.setRGB(7, 14, black.getRGB());
        startingImg.setRGB(10, 14, legBrown.getRGB());
        startingImg.setRGB(3, 15, black.getRGB());
        startingImg.setRGB(4, 15, black.getRGB());
        startingImg.setRGB(5, 15, black.getRGB());
        startingImg.setRGB(9, 15, legBrown.getRGB());
        startingImg.setRGB(6, 16, legBrown.getRGB());
        startingImg.setRGB(7, 16, legBrown.getRGB());
        startingImg.setRGB(8, 16, legBrown.getRGB());
        Color backgroundColor = makeRandomColor();

        for(int j = 0; j < startingImg.getHeight(); ++j) {
            for(int i = 0; i < startingImg.getWidth(); ++i) {
                if (isTransparent(i, j, startingImg)) {
                    startingImg.setRGB(i, j, backgroundColor.getRGB());
                }
            }
        }

        repaintBird(startingImg);
        return startingImg;
    }

    public static BufferedImage create2x2Image() {
        BufferedImage bird1 = createRandomImage(18, 18);
        BufferedImage bird2 = createRandomImage(18, 18);
        BufferedImage bird3 = createRandomImage(18, 18);
        BufferedImage bird4 = createRandomImage(18, 18);
        BufferedImage finalImg = new BufferedImage(36, 36, 6);

        int j;
        int i;
        for(j = 0; j < bird1.getHeight(); ++j) {
            for(i = 0; i < bird1.getWidth(); ++i) {
                finalImg.setRGB(i, j, bird1.getRGB(i, j));
            }
        }

        for(j = 0; j < bird2.getHeight(); ++j) {
            for(i = 0; i < bird2.getWidth(); ++i) {
                finalImg.setRGB(i, j + 18, bird2.getRGB(i, j));
            }
        }

        for(j = 0; j < bird3.getHeight(); ++j) {
            for(i = 0; i < bird3.getWidth(); ++i) {
                finalImg.setRGB(i + 18, j, bird3.getRGB(i, j));
            }
        }

        for(j = 0; j < bird4.getHeight(); ++j) {
            for(i = 0; i < bird3.getWidth(); ++i) {
                finalImg.setRGB(i + 18, j + 18, bird4.getRGB(i, j));
            }
        }

        return finalImg;
    }

    public static boolean isTransparent(int x, int y, BufferedImage img) {
        int pixel = img.getRGB(x, y);
        return pixel >> 24 == 0;
    }

    public static void saveFinal(BufferedImage finalImg) throws IOException {
        String allBirdNames = new String(Files.readAllBytes(Paths.get("E:\\birbs\\birbIDs.txt")));
        String[] IDs = allBirdNames.split(",");
        String lastIDString = IDs[IDs.length - 1];
        Integer lastID = Integer.parseInt(lastIDString);
        Integer newLastID = lastID + 1;

        try {
            File outputfile = new File("E:\\birbs\\birb" + newLastID + ".png");
            ImageIO.write(finalImg, "png", outputfile);

            try {
                String newIDstring = newLastID + ",";
                Files.write(Paths.get("E:\\birbs\\birbIDs.txt"), newIDstring.getBytes(), new OpenOption[]{StandardOpenOption.APPEND});
            } catch (IOException var9) {
            }
        } catch (IOException var10) {
        }

    }

    public static void repaintBirdRandom(BufferedImage defaultBird) {
        for(int j = 0; j < defaultBird.getHeight(); ++j) {
            for(int i = 0; i < defaultBird.getWidth(); ++i) {
                if (defaultBird.getRGB(i, j) == darkerBrown.getRGB()) {
                    defaultBird.setRGB(i, j, makeRandomColor().getRGB());
                } else if (defaultBird.getRGB(i, j) == creme.getRGB()) {
                    defaultBird.setRGB(i, j, makeRandomColor().getRGB());
                }

                if (defaultBird.getRGB(i, j) == darkBrown.getRGB()) {
                    defaultBird.setRGB(i, j, makeRandomColor().getRGB());
                } else if (defaultBird.getRGB(i, j) == lighterBrown.getRGB()) {
                    defaultBird.setRGB(i, j, makeRandomColor().getRGB());
                }
            }
        }

    }

    public static void repaintBird(BufferedImage defaultBird) {
        Color newColor1 = makeRandomColor();
        Color newColor2 = makeRandomColor();
        Color newColor3 = makeRandomColor();
        Color newColor4 = makeRandomColor();

        for(int j = 0; j < defaultBird.getHeight(); ++j) {
            for(int i = 0; i < defaultBird.getWidth(); ++i) {
                if (defaultBird.getRGB(i, j) == darkerBrown.getRGB()) {
                    defaultBird.setRGB(i, j, newColor1.getRGB());
                } else if (defaultBird.getRGB(i, j) == creme.getRGB()) {
                    defaultBird.setRGB(i, j, newColor2.getRGB());
                }

                if (defaultBird.getRGB(i, j) == darkBrown.getRGB()) {
                    defaultBird.setRGB(i, j, newColor3.getRGB());
                } else if (defaultBird.getRGB(i, j) == lighterBrown.getRGB()) {
                    defaultBird.setRGB(i, j, newColor4.getRGB());
                }
            }
        }

    }

    public static Color makeRandomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }
}
