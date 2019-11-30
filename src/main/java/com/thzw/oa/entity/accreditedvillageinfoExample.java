package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.List;

public class accreditedvillageinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public accreditedvillageinfoExample() {
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

        public Criteria andAccreditedvillagenameIsNull() {
            addCriterion("AccreditedVillageName is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameIsNotNull() {
            addCriterion("AccreditedVillageName is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameEqualTo(String value) {
            addCriterion("AccreditedVillageName =", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameNotEqualTo(String value) {
            addCriterion("AccreditedVillageName <>", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameGreaterThan(String value) {
            addCriterion("AccreditedVillageName >", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameGreaterThanOrEqualTo(String value) {
            addCriterion("AccreditedVillageName >=", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameLessThan(String value) {
            addCriterion("AccreditedVillageName <", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameLessThanOrEqualTo(String value) {
            addCriterion("AccreditedVillageName <=", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameLike(String value) {
            addCriterion("AccreditedVillageName like", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameNotLike(String value) {
            addCriterion("AccreditedVillageName not like", value, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameIn(List<String> values) {
            addCriterion("AccreditedVillageName in", values, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameNotIn(List<String> values) {
            addCriterion("AccreditedVillageName not in", values, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameBetween(String value1, String value2) {
            addCriterion("AccreditedVillageName between", value1, value2, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedvillagenameNotBetween(String value1, String value2) {
            addCriterion("AccreditedVillageName not between", value1, value2, "accreditedvillagename");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidIsNull() {
            addCriterion("AccreditedTownID is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidIsNotNull() {
            addCriterion("AccreditedTownID is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidEqualTo(Integer value) {
            addCriterion("AccreditedTownID =", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotEqualTo(Integer value) {
            addCriterion("AccreditedTownID <>", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidGreaterThan(Integer value) {
            addCriterion("AccreditedTownID >", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccreditedTownID >=", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidLessThan(Integer value) {
            addCriterion("AccreditedTownID <", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidLessThanOrEqualTo(Integer value) {
            addCriterion("AccreditedTownID <=", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidIn(List<Integer> values) {
            addCriterion("AccreditedTownID in", values, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotIn(List<Integer> values) {
            addCriterion("AccreditedTownID not in", values, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedTownID between", value1, value2, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedTownID not between", value1, value2, "accreditedtownid");
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