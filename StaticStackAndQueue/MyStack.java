package StaticStackAndQueue;

 class MyStack {

    private int  arr[];
    private int top;

     public MyStack(){
         this.arr = new int[5];
         top=-1;
     }

      public MyStack(int size){
         this.arr=new int[size];
          top=-1;
      }


      public void push(int num)throws Exception{

         if(isFull()){
             throw new Exception("Stack is already full");
         }

          top++;
         arr[top]=num;
      }

      public int pop()throws Exception {

              if (isEmpty()) {
                  throw new Exception("Stack is already empty");
              }


          int ele=arr[top+1];
         top--;
         return ele;
      }

      public int peek(){
         return arr[top];
      }

      public int size(){
         return top+1;
      }

      public boolean isEmpty(){
         return size()==0;
      }

      public boolean isFull(){
         return size()==arr.length;
      }

      public void display(){
         for(int i=top;i>=0;i--)
             System.out.println(arr[i]);

      }

}
