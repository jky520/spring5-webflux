/*
 * This file is generated by jOOQ.
*/
package com.example.demo.db.tables.records;


import com.example.demo.db.tables.Faq;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FaqRecord extends UpdatableRecordImpl<FaqRecord> implements Record7<Integer, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1065183473;

    /**
     * Setter for <code>spring.faq.faq_id</code>.
     */
    public FaqRecord setFaqId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.faq_id</code>.
     */
    public Integer getFaqId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>spring.faq.title</code>.
     */
    public FaqRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring.faq.question</code>.
     */
    public FaqRecord setQuestion(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.question</code>.
     */
    public String getQuestion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring.faq.answer</code>.
     */
    public FaqRecord setAnswer(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.answer</code>.
     */
    public String getAnswer() {
        return (String) get(3);
    }

    /**
     * Setter for <code>spring.faq.version</code>.
     */
    public FaqRecord setVersion(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>spring.faq.updated_time</code>.
     */
    public FaqRecord setUpdatedTime(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.updated_time</code>.
     */
    public Timestamp getUpdatedTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>spring.faq.created_time</code>.
     */
    public FaqRecord setCreatedTime(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>spring.faq.created_time</code>.
     */
    public Timestamp getCreatedTime() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Faq.FAQ.FAQ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Faq.FAQ.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Faq.FAQ.QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Faq.FAQ.ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Faq.FAQ.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Faq.FAQ.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Faq.FAQ.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFaqId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFaqId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value1(Integer value) {
        setFaqId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value3(String value) {
        setQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value4(String value) {
        setAnswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value5(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value6(Timestamp value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord value7(Timestamp value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FaqRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FaqRecord
     */
    public FaqRecord() {
        super(Faq.FAQ);
    }

    /**
     * Create a detached, initialised FaqRecord
     */
    public FaqRecord(Integer faqId, String title, String question, String answer, Integer version, Timestamp updatedTime, Timestamp createdTime) {
        super(Faq.FAQ);

        set(0, faqId);
        set(1, title);
        set(2, question);
        set(3, answer);
        set(4, version);
        set(5, updatedTime);
        set(6, createdTime);
    }
}