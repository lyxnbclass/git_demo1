package homework1.test1;

import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            // 1. 定义商品价格（题目要求的 5 种商品）
            int bookPrice = 12;
            int pencilPrice = 1;
            int eraserPrice = 2;
            int colaPrice = 3;
            int snackPrice = 5;

            // 初始总钱数（题目给定）
            int totalMoney = 20;
            // 买完书本后剩余的钱
            int remainingMoney = totalMoney - bookPrice;

            // 2. 打印商品价格和剩余金额信息
            System.out.println("书本的价格为：" + bookPrice + "元，您总共有" + totalMoney + "元");
            System.out.println("1. 铅笔的价格为：" + pencilPrice + "元");
            System.out.println("2. 橡皮的价格为：" + eraserPrice + "元");
            System.out.println("3. 可乐的价格为：" + colaPrice + "元");
            System.out.println("4. 零食的价格为：" + snackPrice + "元");
            
            System.out.println("请输入你需要购买商品的序列号：");
            System.out.println("请输入你需要购买商品的序列号：");
            // 3. 获取用户输入
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // 4. 使用 switch 判断并计算
            switch (choice) {
                case 1:
                    // 计算可购买数量和剩余金额
                    int pencilCount = remainingMoney / pencilPrice;
                    int pencilLeft = remainingMoney % pencilPrice;
                    System.out.println("可以购买 " + pencilCount + " 支铅笔，剩余 " + pencilLeft + " 元");
                    break;
                case 2:
                    int eraserCount = remainingMoney / eraserPrice;
                    int eraserLeft = remainingMoney % eraserPrice;
                    System.out.println("可以购买 " + eraserCount + " 块橡皮，剩余 " + eraserLeft + " 元");
                    break;
                case 3:
                    int colaCount = remainingMoney / colaPrice;
                    int colaLeft = remainingMoney % colaPrice;
                    System.out.println("可以购买 " + colaCount + " 瓶可乐，剩余 " + colaLeft + " 元");
                    break;
                case 4:
                    int snackCount = remainingMoney / snackPrice;
                    int snackLeft = remainingMoney % snackPrice;
                    System.out.println("可以购买 " + snackCount + " 份零食，剩余 " + snackLeft + " 元");
                    break;
                default:
                    System.out.println("输入序号无效，请重新运行程序选择 1-4 之间的序号！");
            }

            scanner.close();
        }
    }

