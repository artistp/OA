package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.List;

public class imtomemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public imtomemberExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andTouseridIsNull() {
            addCriterion("ToUserID is null");
            return (Criteria) this;
        }

        public Criteria andTouseridIsNotNull() {
            addCriterion("ToUserID is not null");
            return (Criteria) this;
        }

        public Criteria andTouseridEqualTo(Long value) {
            addCriterion("ToUserID =", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotEqualTo(Long value) {
            addCriterion("ToUserID <>", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThan(Long value) {
            addCriterion("ToUserID >", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ToUserID >=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThan(Long value) {
            addCriterion("ToUserID <", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridLessThanOrEqualTo(Long value) {
            addCriterion("ToUserID <=", value, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridIn(List<Long> values) {
            addCriterion("ToUserID in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotIn(List<Long> values) {
            addCriterion("ToUserID not in", values, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridBetween(Long value1, Long value2) {
            addCriterion("ToUserID between", value1, value2, "touserid");
            return (Criteria) this;
        }

        public Criteria andTouseridNotBetween(Long value1, Long value2) {
            addCriterion("ToUserID not between", value1, value2, "touserid");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNull() {
            addCriterion("IFCheck is null");
            return (Criteria) this;
        }

        public Criteria andIfcheckIsNotNull() {
            addCriterion("IFCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIfcheckEqualTo(Byte value) {
            addCriterion("IFCheck =", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotEqualTo(Byte value) {
            addCriterion("IFCheck <>", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThan(Byte value) {
            addCriterion("IFCheck >", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckGreaterThanOrEqualTo(Byte value) {
            addCriterion("IFCheck >=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThan(Byte value) {
            addCriterion("IFCheck <", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckLessThanOrEqualTo(Byte value) {
            addCriterion("IFCheck <=", value, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckIn(List<Byte> values) {
            addCriterion("IFCheck in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotIn(List<Byte> values) {
            addCriterion("IFCheck not in", values, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckBetween(Byte value1, Byte value2) {
            addCriterion("IFCheck between", value1, value2, "ifcheck");
            return (Criteria) this;
        }

        public Criteria andIfcheckNotBetween(Byte value1, Byte value2) {
            addCriterion("IFCheck not between", value1, value2, "ifcheck");
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