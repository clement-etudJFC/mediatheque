/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author cmariage
 */
public class BookPrinter extends Printer{
    @Override
    public void visit(Book item){
        System.out.println("Book :"+item);
    };
    @Override
    public void visit(CD item){
    };
}
