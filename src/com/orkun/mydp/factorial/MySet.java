package com.orkun.mydp.factorial;

public class MySet {

    private MyLinkList myLinkList;

    public void add(Integer t){
        if(myLinkList ==null){
            myLinkList = new MyLinkList(t);
            return;
        }
        MyLinkList tmp = myLinkList;
        while(tmp == null){
            if(tmp.data == t){
                return;
            }else{
                if (tmp.data != t){
                    tmp = tmp.next;
                }else{
                    tmp.next = new MyLinkList(t);
                }
            }
        }

    }

}

class MyLinkList{
    public int data;
    public MyLinkList next;

    MyLinkList(int data){
        this.data = data;
        this.next = null;
    }

    MyLinkList(){
        this.next = null;
    }
}
