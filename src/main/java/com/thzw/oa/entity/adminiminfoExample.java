package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class adminiminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public adminiminfoExample() {
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

        public Criteria andImidIsNull() {
            addCriterion("IMID is null");
            return (Criteria) this;
        }

        public Criteria andImidIsNotNull() {
            addCriterion("IMID is not null");
            return (Criteria) this;
        }

        public Criteria andImidEqualTo(Integer value) {
            addCriterion("IMID =", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotEqualTo(Integer value) {
            addCriterion("IMID <>", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidGreaterThan(Integer value) {
            addCriterion("IMID >", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMID >=", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidLessThan(Integer value) {
            addCriterion("IMID <", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidLessThanOrEqualTo(Integer value) {
            addCriterion("IMID <=", value, "imid");
            return (Criteria) this;
        }

        public Criteria andImidIn(List<Integer> values) {
            addCriterion("IMID in", values, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotIn(List<Integer> values) {
            addCriterion("IMID not in", values, "imid");
            return (Criteria) this;
        }

        public Criteria andImidBetween(Integer value1, Integer value2) {
            addCriterion("IMID between", value1, value2, "imid");
            return (Criteria) this;
        }

        public Criteria andImidNotBetween(Integer value1, Integer value2) {
            addCriterion("IMID not between", value1, value2, "imid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("STime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("STime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterion("STime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterion("STime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterion("STime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterion("STime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterion("STime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterion("STime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterion("STime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterion("STime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterion("STime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("ETime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("ETime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("ETime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("ETime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("ETime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ETime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("ETime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("ETime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("ETime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("ETime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("ETime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("ETime not between", value1, value2, "etime");
            return (Criteria) this;
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

        public Criteria andImtypeIsNull() {
            addCriterion("IMType is null");
            return (Criteria) this;
        }

        public Criteria andImtypeIsNotNull() {
            addCriterion("IMType is not null");
            return (Criteria) this;
        }

        public Criteria andImtypeEqualTo(Byte value) {
            addCriterion("IMType =", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeNotEqualTo(Byte value) {
            addCriterion("IMType <>", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeGreaterThan(Byte value) {
            addCriterion("IMType >", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("IMType >=", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeLessThan(Byte value) {
            addCriterion("IMType <", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeLessThanOrEqualTo(Byte value) {
            addCriterion("IMType <=", value, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeIn(List<Byte> values) {
            addCriterion("IMType in", values, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeNotIn(List<Byte> values) {
            addCriterion("IMType not in", values, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeBetween(Byte value1, Byte value2) {
            addCriterion("IMType between", value1, value2, "imtype");
            return (Criteria) this;
        }

        public Criteria andImtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("IMType not between", value1, value2, "imtype");
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