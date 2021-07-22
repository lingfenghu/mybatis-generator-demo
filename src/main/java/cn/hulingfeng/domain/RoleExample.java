package cn.hulingfeng.domain;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RoleExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andRoleIdIsNull() {
            addCriterion("Role_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("Role_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("Role_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("Role_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("Role_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Role_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("Role_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("Role_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("Role_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("Role_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Role_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("Role_Code is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("Role_Code is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("Role_Code =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("Role_Code <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("Role_Code >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Role_Code >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("Role_Code <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("Role_Code <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("Role_Code like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("Role_Code not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("Role_Code in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("Role_Code not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("Role_Code between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("Role_Code not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("RoleName is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("RoleName is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("RoleName =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("RoleName <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("RoleName >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("RoleName >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("RoleName <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("RoleName <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("RoleName like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("RoleName not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("RoleName in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("RoleName not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("RoleName between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("RoleName not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlIsNull() {
            addCriterion("RoleType_SL is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlIsNotNull() {
            addCriterion("RoleType_SL is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlEqualTo(String value) {
            addCriterion("RoleType_SL =", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlNotEqualTo(String value) {
            addCriterion("RoleType_SL <>", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlGreaterThan(String value) {
            addCriterion("RoleType_SL >", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlGreaterThanOrEqualTo(String value) {
            addCriterion("RoleType_SL >=", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlLessThan(String value) {
            addCriterion("RoleType_SL <", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlLessThanOrEqualTo(String value) {
            addCriterion("RoleType_SL <=", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlLike(String value) {
            addCriterion("RoleType_SL like", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlNotLike(String value) {
            addCriterion("RoleType_SL not like", value, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlIn(List<String> values) {
            addCriterion("RoleType_SL in", values, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlNotIn(List<String> values) {
            addCriterion("RoleType_SL not in", values, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlBetween(String value1, String value2) {
            addCriterion("RoleType_SL between", value1, value2, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andRoletypeSlNotBetween(String value1, String value2) {
            addCriterion("RoleType_SL not between", value1, value2, "roletypeSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlIsNull() {
            addCriterion("System_SL is null");
            return (Criteria) this;
        }

        public Criteria andSystemSlIsNotNull() {
            addCriterion("System_SL is not null");
            return (Criteria) this;
        }

        public Criteria andSystemSlEqualTo(String value) {
            addCriterion("System_SL =", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlNotEqualTo(String value) {
            addCriterion("System_SL <>", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlGreaterThan(String value) {
            addCriterion("System_SL >", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlGreaterThanOrEqualTo(String value) {
            addCriterion("System_SL >=", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlLessThan(String value) {
            addCriterion("System_SL <", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlLessThanOrEqualTo(String value) {
            addCriterion("System_SL <=", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlLike(String value) {
            addCriterion("System_SL like", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlNotLike(String value) {
            addCriterion("System_SL not like", value, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlIn(List<String> values) {
            addCriterion("System_SL in", values, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlNotIn(List<String> values) {
            addCriterion("System_SL not in", values, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlBetween(String value1, String value2) {
            addCriterion("System_SL between", value1, value2, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSystemSlNotBetween(String value1, String value2) {
            addCriterion("System_SL not between", value1, value2, "systemSl");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("SortNo is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("SortNo is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("SortNo =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("SortNo <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("SortNo >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortNo >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("SortNo <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("SortNo <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Integer> values) {
            addCriterion("SortNo in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Integer> values) {
            addCriterion("SortNo not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("SortNo between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("SortNo not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOprCodeIsNull() {
            addCriterion("Opr_Code is null");
            return (Criteria) this;
        }

        public Criteria andOprCodeIsNotNull() {
            addCriterion("Opr_Code is not null");
            return (Criteria) this;
        }

        public Criteria andOprCodeEqualTo(String value) {
            addCriterion("Opr_Code =", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeNotEqualTo(String value) {
            addCriterion("Opr_Code <>", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeGreaterThan(String value) {
            addCriterion("Opr_Code >", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Opr_Code >=", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeLessThan(String value) {
            addCriterion("Opr_Code <", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeLessThanOrEqualTo(String value) {
            addCriterion("Opr_Code <=", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeLike(String value) {
            addCriterion("Opr_Code like", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeNotLike(String value) {
            addCriterion("Opr_Code not like", value, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeIn(List<String> values) {
            addCriterion("Opr_Code in", values, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeNotIn(List<String> values) {
            addCriterion("Opr_Code not in", values, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeBetween(String value1, String value2) {
            addCriterion("Opr_Code between", value1, value2, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprCodeNotBetween(String value1, String value2) {
            addCriterion("Opr_Code not between", value1, value2, "oprCode");
            return (Criteria) this;
        }

        public Criteria andOprdateIsNull() {
            addCriterion("OprDate is null");
            return (Criteria) this;
        }

        public Criteria andOprdateIsNotNull() {
            addCriterion("OprDate is not null");
            return (Criteria) this;
        }

        public Criteria andOprdateEqualTo(String value) {
            addCriterion("OprDate =", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateNotEqualTo(String value) {
            addCriterion("OprDate <>", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateGreaterThan(String value) {
            addCriterion("OprDate >", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateGreaterThanOrEqualTo(String value) {
            addCriterion("OprDate >=", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateLessThan(String value) {
            addCriterion("OprDate <", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateLessThanOrEqualTo(String value) {
            addCriterion("OprDate <=", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateLike(String value) {
            addCriterion("OprDate like", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateNotLike(String value) {
            addCriterion("OprDate not like", value, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateIn(List<String> values) {
            addCriterion("OprDate in", values, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateNotIn(List<String> values) {
            addCriterion("OprDate not in", values, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateBetween(String value1, String value2) {
            addCriterion("OprDate between", value1, value2, "oprdate");
            return (Criteria) this;
        }

        public Criteria andOprdateNotBetween(String value1, String value2) {
            addCriterion("OprDate not between", value1, value2, "oprdate");
            return (Criteria) this;
        }
    }

    /**
     */
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