package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class userbaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userbaseinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("Pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("Pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("Pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("Pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("Pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("Pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("Pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("Pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("Pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("Pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("Pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("Pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNull() {
            addCriterion("PoliticalStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNotNull() {
            addCriterion("PoliticalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusEqualTo(String value) {
            addCriterion("PoliticalStatus =", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotEqualTo(String value) {
            addCriterion("PoliticalStatus <>", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThan(String value) {
            addCriterion("PoliticalStatus >", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PoliticalStatus >=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThan(String value) {
            addCriterion("PoliticalStatus <", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThanOrEqualTo(String value) {
            addCriterion("PoliticalStatus <=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLike(String value) {
            addCriterion("PoliticalStatus like", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotLike(String value) {
            addCriterion("PoliticalStatus not like", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIn(List<String> values) {
            addCriterion("PoliticalStatus in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotIn(List<String> values) {
            addCriterion("PoliticalStatus not in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusBetween(String value1, String value2) {
            addCriterion("PoliticalStatus between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotBetween(String value1, String value2) {
            addCriterion("PoliticalStatus not between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionIsNull() {
            addCriterion("OriginalPosition is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionIsNotNull() {
            addCriterion("OriginalPosition is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionEqualTo(String value) {
            addCriterion("OriginalPosition =", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionNotEqualTo(String value) {
            addCriterion("OriginalPosition <>", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionGreaterThan(String value) {
            addCriterion("OriginalPosition >", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionGreaterThanOrEqualTo(String value) {
            addCriterion("OriginalPosition >=", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionLessThan(String value) {
            addCriterion("OriginalPosition <", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionLessThanOrEqualTo(String value) {
            addCriterion("OriginalPosition <=", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionLike(String value) {
            addCriterion("OriginalPosition like", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionNotLike(String value) {
            addCriterion("OriginalPosition not like", value, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionIn(List<String> values) {
            addCriterion("OriginalPosition in", values, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionNotIn(List<String> values) {
            addCriterion("OriginalPosition not in", values, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionBetween(String value1, String value2) {
            addCriterion("OriginalPosition between", value1, value2, "originalposition");
            return (Criteria) this;
        }

        public Criteria andOriginalpositionNotBetween(String value1, String value2) {
            addCriterion("OriginalPosition not between", value1, value2, "originalposition");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidIsNull() {
            addCriterion("AccreditedVillageID is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidIsNotNull() {
            addCriterion("AccreditedVillageID is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidEqualTo(Integer value) {
            addCriterion("AccreditedVillageID =", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidNotEqualTo(Integer value) {
            addCriterion("AccreditedVillageID <>", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidGreaterThan(Integer value) {
            addCriterion("AccreditedVillageID >", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccreditedVillageID >=", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidLessThan(Integer value) {
            addCriterion("AccreditedVillageID <", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidLessThanOrEqualTo(Integer value) {
            addCriterion("AccreditedVillageID <=", value, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidIn(List<Integer> values) {
            addCriterion("AccreditedVillageID in", values, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidNotIn(List<Integer> values) {
            addCriterion("AccreditedVillageID not in", values, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedVillageID between", value1, value2, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillageidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedVillageID not between", value1, value2, "accreditedvillageid");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("Remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("Remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("Remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("Remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("Remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("Remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("Remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("Remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("Remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("Remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("Remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("Remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("Remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("PicURL is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("PicURL is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("PicURL =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("PicURL <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("PicURL >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("PicURL >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("PicURL <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("PicURL <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("PicURL like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("PicURL not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("PicURL in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("PicURL not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("PicURL between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("PicURL not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNull() {
            addCriterion("RoleType is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNotNull() {
            addCriterion("RoleType is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeEqualTo(Byte value) {
            addCriterion("RoleType =", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotEqualTo(Byte value) {
            addCriterion("RoleType <>", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThan(Byte value) {
            addCriterion("RoleType >", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("RoleType >=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThan(Byte value) {
            addCriterion("RoleType <", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThanOrEqualTo(Byte value) {
            addCriterion("RoleType <=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeIn(List<Byte> values) {
            addCriterion("RoleType in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotIn(List<Byte> values) {
            addCriterion("RoleType not in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeBetween(Byte value1, Byte value2) {
            addCriterion("RoleType between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotBetween(Byte value1, Byte value2) {
            addCriterion("RoleType not between", value1, value2, "roletype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}