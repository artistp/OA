package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class teammates_select_missionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public teammates_select_missionExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andImidIsNull() {
            addCriterion("imid is null");
            return (Criteria) this;
        }

        public Criteria andImidIsNotNull() {
            addCriterion("imid is not null");
            return (Criteria) this;
        }

        public Criteria andImidEqualTo(Integer value) {
            addCriterion("imid =", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotEqualTo(Integer value) {
            addCriterion("imid <>", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidGreaterThan(Integer value) {
            addCriterion("imid >", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidGreaterThanOrEqualTo(Integer value) {
            addCriterion("imid >=", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidLessThan(Integer value) {
            addCriterion("imid <", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidLessThanOrEqualTo(Integer value) {
            addCriterion("imid <=", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidIn(List<Integer> values) {
            addCriterion("imid in", values, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotIn(List<Integer> values) {
            addCriterion("imid not in", values, "imid");
            return (Criteria) this;
        }

        public Criteria andImidBetween(Integer value1, Integer value2) {
            addCriterion("imid between", value1, value2, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotBetween(Integer value1, Integer value2) {
            addCriterion("imid not between", value1, value2, "imid");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNull() {
            addCriterion("ifCheck is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNotNull() {
            addCriterion("ifCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckEqualTo(Byte value) {
            addCriterion("ifCheck =", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotEqualTo(Byte value) {
            addCriterion("ifCheck <>", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThan(Byte value) {
            addCriterion("ifCheck >", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("ifCheck >=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThan(Byte value) {
            addCriterion("ifCheck <", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThanOrEqualTo(Byte value) {
            addCriterion("ifCheck <=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckIn(List<Byte> values) {
            addCriterion("ifCheck in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotIn(List<Byte> values) {
            addCriterion("ifCheck not in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckBetween(Byte value1, Byte value2) {
            addCriterion("ifCheck between", value1, value2, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotBetween(Byte value1, Byte value2) {
            addCriterion("ifCheck not between", value1, value2, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("Etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("Etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("Etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("Etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("Etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("Etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("Etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("Etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("Etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("Etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("Etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIsNull() {
            addCriterion("captainName is null");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIsNotNull() {
            addCriterion("captainName is not null");
            return (Criteria) this;
        }

        public Criteria andCaptainnameEqualTo(String value) {
            addCriterion("captainName =", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotEqualTo(String value) {
            addCriterion("captainName <>", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameGreaterThan(String value) {
            addCriterion("captainName >", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameGreaterThanOrEqualTo(String value) {
            addCriterion("captainName >=", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLessThan(String value) {
            addCriterion("captainName <", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLessThanOrEqualTo(String value) {
            addCriterion("captainName <=", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLike(String value) {
            addCriterion("captainName like", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotLike(String value) {
            addCriterion("captainName not like", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIn(List<String> values) {
            addCriterion("captainName in", values, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotIn(List<String> values) {
            addCriterion("captainName not in", values, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameBetween(String value1, String value2) {
            addCriterion("captainName between", value1, value2, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotBetween(String value1, String value2) {
            addCriterion("captainName not between", value1, value2, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainidIsNull() {
            addCriterion("captainID is null");
            return (Criteria) this;
        }

        public Criteria andCaptainidIsNotNull() {
            addCriterion("captainID is not null");
            return (Criteria) this;
        }

        public Criteria andCaptainidEqualTo(Long value) {
            addCriterion("captainID =", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidNotEqualTo(Long value) {
            addCriterion("captainID <>", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidGreaterThan(Long value) {
            addCriterion("captainID >", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidGreaterThanOrEqualTo(Long value) {
            addCriterion("captainID >=", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidLessThan(Long value) {
            addCriterion("captainID <", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidLessThanOrEqualTo(Long value) {
            addCriterion("captainID <=", value, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidIn(List<Long> values) {
            addCriterion("captainID in", values, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidNotIn(List<Long> values) {
            addCriterion("captainID not in", values, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidBetween(Long value1, Long value2) {
            addCriterion("captainID between", value1, value2, "captainid");
            return (Criteria) this;
        }

        public Criteria andCaptainidNotBetween(Long value1, Long value2) {
            addCriterion("captainID not between", value1, value2, "captainid");
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