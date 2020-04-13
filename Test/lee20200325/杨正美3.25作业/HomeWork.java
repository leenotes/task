package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * 1.创建文件
 * 2.写入多行文本
 * 3.读取文本并每行头追加[序号]
 * 4.将3处理后的每行文本顺序保存到新的文件中
 * 5.读取新文件，利用检测函数判断序号追加是否正确，正确打印出“Passed”，错误的话打印出“Failed”
 * 并将测试结果打印记录到新文件"report.txt"中
 */
public class HomeWork01 {

    public static void main(String[] args) throws IOException {
        String[] strs = {"创建文件", "写入多行文本", "读取文本并每行头追加[序号]", "将3处理后的每行文本顺序保存到新的文件中",
                "读取新文件，利用检测函数判断序号追加是否正确，正确打印出“Passed”，错误的话打印出“Failed”", "并将测试结果打印记录到新文件\"report.txt\"中"};
        // 创建文件
        File file = new File("myFile.txt");
        createNewFile(strs, file);
        updateFile(file);
        testFile(file);
    }

    private static void createNewFile(String[] strs, File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String str : strs) {
            writer.write(str);
            writer.newLine();
        }
        // 关闭流
        writer.close();
        System.out.println("文件写入成功, 磁盘物理路径为: " + file.getAbsolutePath());
    }

    private static void updateFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        String str = null;
        while ((str = reader.readLine()) != null) {
            list.add(str);
        }
        // 关闭输入流
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < list.size(); i++) {
            writer.write(i + 1 + "." + list.get(i));
            writer.newLine();
        }
        // 关闭输出流
        writer.close();
        System.out.println("更新文件成功, 磁盘物理路径为: " + file.getAbsolutePath());
    }

    private static void testFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        // 创建输出文件
        File outFile = new File("report.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        int idx = 1;
        String str = null;
        while ((str = reader.readLine())!= null) {
            if (str.startsWith(idx+"")) {
                writer.write("第" + idx+ "行: Passed");
            } else {
                writer.write("第" + idx+ "行: Failed");
            }
            writer.newLine();
            idx++;
        }
        // 关闭流
        reader.close();
        writer.close();
        System.out.println("测试结束，测试结果物理磁盘路径: " + outFile.getAbsolutePath());

    }

}
