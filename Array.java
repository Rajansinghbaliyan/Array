import java.util.Random;
class Array extends test {
    int size ;
    int arr[];

  void set(){
    Random rand = new Random();
    size = rand.nextInt(10);
    int a[] = new int[size];
    for (int i =0;i<size;i++){
      a[i]=rand.nextInt(100);
      }
      arr=a;
    }
  void arrayShow (){
    for (int i =0;i<size;i++){
      System.out.println(arr[i]);
          }

  }

}
