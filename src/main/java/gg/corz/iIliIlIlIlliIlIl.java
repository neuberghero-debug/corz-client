package gg.corz;

import com.google.gson.JsonObject;

public record iIliIlIlIlliIlIl(int originX, int originY, int originZ, int rotationIndex, int mirrorIndex) {
   private final int lIliIIIiIl;
   private final int IlliIIIiIl;
   private final int iIliIIIiIl;
   private final int illiIIIiIl;
   private final int llliIIIiIl;

   public int IIIllIIliIIl() {
      return this.iIliIIIiIl;
   }

   public int IlIlllIlilIl() {
      return this.IlliIIIiIl;
   }

   public iIliIlIlIlliIlIl(int originX, int originY, int originZ, int rotationIndex, int mirrorIndex) {
      this.lIliIIIiIl = originX;
      this.iIliIIIiIl = originY;
      this.IlliIIIiIl = originZ;
      this.llliIIIiIl = rotationIndex;
      this.illiIIIiIl = mirrorIndex;
   }

   public int iliIiiliiiii() {
      return this.lIliIIIiIl;
   }

   public String lIiiIiIlilli() {
      return this.lIliIIIiIl
         + Illlllllilll<"Illlllllilll","iddInvzynBJ3oMlrDx3XCcTmHa2N36HSNjW/rog=">()
         + this.iIliIIIiIl
         + Illlllllilll<"Illlllllilll","iddInvzynBJ3oMlrDx3XCcTmHa2N36HSNjW/rog=">()
         + this.IlliIIIiIl
         + Illlllllilll<"Illlllllilll","ke60+s6vBWNSo5ijihqWw5lqpmj9mpE/rzttIdrYrmFy">()
         + this.llliIIIiIl
         + Illlllllilll<"Illlllllilll","W4bdnDB9YoP2LMXgsUGctSY7tOxzjYwQeKGkecw4qUOH+jrI">()
         + this.illiIIIiIl;
   }

   public int IiIlliIliiIl() {
      return this.llliIIIiIl;
   }

   public JsonObject iIlIlllllill() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Illlllllilll<"Illlllllilll","P5CPbEj/H8SkoazF2E7dXaA1JHZerLoZVYDo/2CK">(), this.lIliIIIiIl);
      var1.addProperty(Illlllllilll<"Illlllllilll","9jr7lqtPCf7btTmiRvB2BULwnzvZCdKqVoieE2np">(), this.iIliIIIiIl);
      var1.addProperty(Illlllllilll<"Illlllllilll","wLnb+Fbx6lCPyCEkJLFPMjQdqBYcFqX/ly7XBreX">(), this.IlliIIIiIl);
      var1.addProperty(Illlllllilll<"Illlllllilll","kYcQ5cMtqAPgpkCKJC3GDHgIdtN/I5sMx7/u2opDpw==">(), this.llliIIIiIl);
      var1.addProperty(Illlllllilll<"Illlllllilll","oTabOJTj4oO536zrAN18/oYEKovMHGU9BHW0EllelA==">(), this.illiIIIiIl);
      return var1;
   }

   public static boolean IliIlllilIi(int i) {
      return i >= 0 && i <= 3;
   }

   public int IIlllIlliIll() {
      return this.illiIIIiIl;
   }

   public static iIliIlIlIlliIlIl IilliliilIIi(JsonObject o) {
      long var3 = 657200213093906761L;
      if (o != null
         && o.has(Illlllllilll<"Illlllllilll","P5CPbEj/H8SkoazF2E7dXaA1JHZerLoZVYDo/2CK">())
         && o.has(Illlllllilll<"Illlllllilll","9jr7lqtPCf7btTmiRvB2BULwnzvZCdKqVoieE2np">())
         && o.has(Illlllllilll<"Illlllllilll","wLnb+Fbx6lCPyCEkJLFPMjQdqBYcFqX/ly7XBreX">())) {
         try {
            var3 ^= (
                  (long)(
                           o.has(Illlllllilll<"Illlllllilll","kYcQ5cMtqAPgpkCKJC3GDHgIdtN/I5sMx7/u2opDpw==">())
                              ? o.get(Illlllllilll<"Illlllllilll","kYcQ5cMtqAPgpkCKJC3GDHgIdtN/I5sMx7/u2opDpw==">()).getAsInt()
                              : 0
                        )
                        << 32
                     ^ var3
               )
               & -1L << 32;
            var3 ^= (
                  (long)(
                        o.has(Illlllllilll<"Illlllllilll","oTabOJTj4oO536zrAN18/oYEKovMHGU9BHW0EllelA==">())
                           ? o.get(Illlllllilll<"Illlllllilll","oTabOJTj4oO536zrAN18/oYEKovMHGU9BHW0EllelA==">()).getAsInt()
                           : 0
                     )
                     ^ var3
               )
               & -1L >>> 32;
            return IliIlllilIi((int)(var3 >>> 32)) && liiiIIllIl((int)var3)
               ? new iIliIlIlIlliIlIl(
                  o.get(Illlllllilll<"Illlllllilll","P5CPbEj/H8SkoazF2E7dXaA1JHZerLoZVYDo/2CK">()).getAsInt(),
                  o.get(Illlllllilll<"Illlllllilll","9jr7lqtPCf7btTmiRvB2BULwnzvZCdKqVoieE2np">()).getAsInt(),
                  o.get(Illlllllilll<"Illlllllilll","wLnb+Fbx6lCPyCEkJLFPMjQdqBYcFqX/ly7XBreX">()).getAsInt(),
                  (int)(var3 >>> 32),
                  (int)var3
               )
               : null;
         } catch (Exception var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean liiiIIllIl(int i) {
      return i >= 0 && i <= 2;
   }
}
