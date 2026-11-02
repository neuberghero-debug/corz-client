package gg.corz;

import com.google.gson.JsonObject;

record lliiIIliiliiIIli(int status, JsonObject json) {
   private final JsonObject iIiiIiIlIi;
   private final int lIiiIiIlIi;

   private lliiIIliiliiIIli(int status, JsonObject json) {
      this.lIiiIiIlIi = status;
      this.iIiiIiIlIi = json;
   }

   public JsonObject liiiIIllIl() {
      return this.iIiiIiIlIi;
   }

   public int IliIlllilIi() {
      return this.lIiiIiIlIi;
   }
}
