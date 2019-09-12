package com.adil.librapp.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    // @GeneratedValue
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    int bid;
    String bname;
    String author;
    // public Book(int i, String string, String string2) {
    //     this.bid=i;
    //     this.bname=string;
    //     this.author=string2;
	// }

	// boolean isRented;
    /**
     * @return the bid
     */
    public int getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(int bid) {
        this.bid = bid;
    }

    /**
     * @return the bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname the bname to set
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Book [author=" + author + ", bid=" + bid + ", bname=" + bname + "]";
    }


}