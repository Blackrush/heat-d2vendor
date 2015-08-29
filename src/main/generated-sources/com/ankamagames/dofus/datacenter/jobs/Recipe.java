package com.ankamagames.dofus.datacenter.jobs;


public class Recipe
    implements java.io.Serializable {
  public int resultId;
  public long resultNameId;
  public long resultTypeId;
  public int resultLevel;
  public int[] ingredientIds;
  public long[] quantities;
  public int jobId;
  public int skillId;
  public Recipe() {
  }
  public Recipe(int resultId, long resultNameId, long resultTypeId, int resultLevel, int[] ingredientIds, long[] quantities, int jobId, int skillId) {
    this.resultId = resultId;
    this.resultNameId = resultNameId;
    this.resultTypeId = resultTypeId;
    this.resultLevel = resultLevel;
    this.ingredientIds = ingredientIds;
    this.quantities = quantities;
    this.jobId = jobId;
    this.skillId = skillId;
  }

  public int getResultId() {
    return this.resultId;
  }
  public void setResultId(int resultId) {
    this.resultId = resultId;
  }
  public long getResultNameId() {
    return this.resultNameId;
  }
  public void setResultNameId(long resultNameId) {
    this.resultNameId = resultNameId;
  }
  public long getResultTypeId() {
    return this.resultTypeId;
  }
  public void setResultTypeId(long resultTypeId) {
    this.resultTypeId = resultTypeId;
  }
  public int getResultLevel() {
    return this.resultLevel;
  }
  public void setResultLevel(int resultLevel) {
    this.resultLevel = resultLevel;
  }
  public int[] getIngredientIds() {
    return this.ingredientIds;
  }
  public void setIngredientIds(int[] ingredientIds) {
    this.ingredientIds = ingredientIds;
  }
  public long[] getQuantities() {
    return this.quantities;
  }
  public void setQuantities(long[] quantities) {
    this.quantities = quantities;
  }
  public int getJobId() {
    return this.jobId;
  }
  public void setJobId(int jobId) {
    this.jobId = jobId;
  }
  public int getSkillId() {
    return this.skillId;
  }
  public void setSkillId(int skillId) {
    this.skillId = skillId;
  }
}
