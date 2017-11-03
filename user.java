/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author pganeshe
 */
class User {
    private int room_id,roomcharge,additional;
    
    public User(int room_id,int roomcharge,int additional)
    {
        this.room_id=room_id;
        this.roomcharge=roomcharge;
        this.additional=additional;
    }
    
    public int getroom_id(){
        return room_id;
    }
    
    public int getroomcharge(){
        return roomcharge;
    }
    
    public int getadditional(){
        return additional;
    }
}
