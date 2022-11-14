package Timoto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main1 {
    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;
        List<Car> danhSachXe =new ArrayList<>();
        while (check) {
            System.out.println("________Quản Lý Xe Hơi_________");
            System.out.println("1.Nhập xe mới");
            System.out.println("2.Tìm kiếm màu xe");
            System.out.println("3.Tìm kiếm tên xe");
            System.out.println("4.Tìm kiếm theo năm sản xuất");
            System.out.println("5.Xoá 1 xe");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so){
                case 1:
                    nhapXeMoi(danhSachXe);
                    break;
                case 2:
                    timKiemTheoMauXe(danhSachXe) ;
                    break;
                case 3:
                    timKiemTheoTenXe(danhSachXe);
                    break;
                case 4:
                    timKiemTheoNamSanXuat(danhSachXe);
                    break;
                case 5:

                    break;
                case 6:
                    check = false;
                    System.out.println("Exit");
                    break;



            }

        }
    }





    private static void timKiemTheoTenXe(List<Car> danhSachXe) {


        System.out.println("Nhập tên xe cần tìm:");
        String name1 = scanner.nextLine();
        System.out.println("Xe có tên bạn muốn tìm là:");
        for (int i = 0; i < danhSachXe.size(); i++) {
            if (danhSachXe.get(i).getColor().equals(name1)){
                System.out.println(danhSachXe.get(i).toString());
            }
        }

    }

    private static void timKiemTheoNamSanXuat(List<Car> danhSachXeTheoNam) {
        System.out.println("Mơi bạn nhập năm xe bạn cần tìm kiếm:");
        String nam = scanner.nextLine();
        List <String> namXe = List.of(nam.split(","));
        for (int i = 0; i < danhSachXeTheoNam.size(); i++) {
            int namHT = danhSachXeTheoNam.get(i).getYear();
            if(namXe.size() == 1 ) {
                if (namHT == Integer.parseInt(namXe.get(0))) {
                    System.out.println(danhSachXeTheoNam.get(i).toString());

                }

            } else if (namXe.size() == 2) {


                int nam1 = Integer.parseInt(namXe.get(0));
                int nam2 = Integer.parseInt(namXe.get(1));
                if(namHT >= nam1 && namHT <= nam2){
                    System.out.println(danhSachXeTheoNam.get(i).toString());
                }
            }

        }


    }



    private static void timKiemTheoMauXe(List<Car> danhSachMau) {

        System.out.println("Nhập màu xe cần tìm:");
        String color = scanner.nextLine();
        System.out.println("Xe có màu xe bạn cần tìm là:");
        for (int i = 0; i < danhSachMau.size(); i++) {
            if (danhSachMau.get(i).getColor().equals(color)){
                System.out.println(danhSachMau.get(i).toString());
            }
        }
    }


    private static void nhapXeMoi(List<Car> danhSachX) {
        System.out.println("Mời bạn nhập vào số lượng xe:");
        int sl = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sl; i++) {
            System.out.println("Mời bạn nhập màu xe thứ:");
            String color = scanner.nextLine();
            System.out.println("Mời bạn nhập tên xe thứ "+(i+1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập năm sản xuất của xe thứ:"+(i+1));
            int yearsx = Integer.parseInt(scanner.nextLine());

            danhSachX.add(new Car(color,name,yearsx));
        }
    }

}
