/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.biomarket.and.chiquimarket;
import java.io.*;
/**
 *
 * @author jacob
 */
public class AddObjectOutputStream  extends ObjectOutputStream {
    public AddObjectOutputStream(OutputStream out) throws IOException {
    super(out);
}
 
    protected void writeStreamHeader() throws IOException {
    this.reset();
}

}
