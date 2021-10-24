package CaiNiao;

import java.io.*;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 5:20 下午
 * @Version 1.0
 */
public class fileStreamTest {

    public static void deleteFolder(File folder){
        File[] files = folder.listFiles();
        if(files != null){
            for(File file:files){
                if(file.isDirectory()){
                    deleteFolder(file);
                }else {
                    file.delete();
                }
            }
        }
        folder.delete();
    }

    public static void main(String[] args) throws IOException {
        File f = new File("a.text");
        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        writer.append("中文输入！");

        writer.append("\r\n");
        writer.append("english");
        writer.close();
        fop.close();

        //开始读文件

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

        //创建文件夹
        String dirname = "/Users/lzy/spring-study/profile";
        File d = new File(dirname);
        //现在创建目录
        d.mkdirs();

        //读取目录
        String dirname2 = "/Users/lzy/spring-study/src/main/java/CaiNiao";
        File f1 = new File(dirname2);
        if(f1.isDirectory()){
            System.out.println("目录：" + dirname2);
            //获取文件列表
            String s[] = f1.list();
            for(int i = 0;i < s.length; i++){
                File f2 = new File(dirname2 + "/" +s[i]);
                if(f2.isDirectory()){
                    System.out.println(s[i] + ":是一个目录");
                }else {
                    System.out.println(s[i] + ":是一个文件");
                }
            }
        }


        //删除文件及其目录
        File folder = new File("/Users/lzy/spring-study/profile");
        deleteFolder(folder);



    }
}
