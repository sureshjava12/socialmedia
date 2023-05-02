class VarargsMethodExample{

public static void main(String args[]){
one(10);
one(10,20,30);
one(10,40);
one(40,60,70,80);
}

static void one(int b,int... a){

for(int i=0;i<a.length;i++){
System.out.println(a[i]);

}
System.out.println("=============");
}

}