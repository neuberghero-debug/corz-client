package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class lIliIIliiIliIIli {
   public static final int IIllIiIlIi = 1;
   private int IlllIiIlIi;
   private final LinkedHashMap<Long, IlliIIilllliIIil> llllIiIlIi;
   private static final Gson lillIiIlIi = new GsonBuilder().setPrettyPrinting().create();
   private static final long IillIiIlIi = 2097151L;
   private static final int illlIiIlIi = 21;
   private String lIllIiIlIi = "";
   private int iIllIiIlIi;

   public List<IlliIIilllliIIil> Iiiiliiiiiii(Set<Long> schematicCells) {
      ArrayList var2 = new ArrayList();

      for (Map.Entry var4 : this.llllIiIlIi.entrySet()) {
         if (((IlliIIilllliIIil)var4.getValue()).iIlIIiIIil && !schematicCells.contains(var4.getKey())) {
            var2.add((IlliIIilllliIIil)var4.getValue());
         }
      }

      return var2;
   }

   public static lIliIIliiIliIIli Illillliilli(String json) {
      try {
         JsonObject var1 = JsonParser.parseString(json).getAsJsonObject();
         if (var1.has(IIIIllIIIl<"IIIIllIIIl","9nfTo3EU16+JfuTEn3Q+hH8PBQsI5wkSfzpknUXxN5fZ6Q==">())
            && var1.get(IIIIllIIIl<"IIIIllIIIl","9nfTo3EU16+JfuTEn3Q+hH8PBQsI5wkSfzpknUXxN5fZ6Q==">()).getAsInt() == 1) {
            lIliIIliiIliIIli var2 = new lIliIIliiIliIIli(
               var1.has(IIIIllIIIl<"IIIIllIIIl","7rwAAJDr9NoIocOejTlqkV0ZR3laEpgEspAaj9XE+AxB9ZyYmg==">())
                  ? var1.get(IIIIllIIIl<"IIIIllIIIl","7rwAAJDr9NoIocOejTlqkV0ZR3laEpgEspAaj9XE+AxB9ZyYmg==">()).getAsString()
                  : "",
               var1.has(IIIIllIIIl<"IIIIllIIIl","8K0mTkhn6AbKNhKYksUoZ8k0Q/0NR5ZikWB2Xq6WpwiHbM06">())
                  ? var1.get(IIIIllIIIl<"IIIIllIIIl","8K0mTkhn6AbKNhKYksUoZ8k0Q/0NR5ZikWB2Xq6WpwiHbM06">()).getAsInt()
                  : 0,
               var1.has(IIIIllIIIl<"IIIIllIIIl","rsOVb+vSWmUxA5eNZLRsSCGoDJkpoaK67N4X5f78fF40ZQ==">())
                  ? var1.get(IIIIllIIIl<"IIIIllIIIl","rsOVb+vSWmUxA5eNZLRsSCGoDJkpoaK67N4X5f78fF40ZQ==">()).getAsInt()
                  : 0
            );
            if (var1.has(IIIIllIIIl<"IIIIllIIIl","r/oxYUcxWAR6K00eNh1/uFkn3PUbIOx/8Vz0sGpFJMLQOpA=">())) {
               for (JsonElement var4 : var1.getAsJsonArray(IIIIllIIIl<"IIIIllIIIl","r/oxYUcxWAR6K00eNh1/uFkn3PUbIOx/8Vz0sGpFJMLQOpA=">())) {
                  IlliIIilllliIIil var5 = (IlliIIilllliIIil)lillIiIlIi.fromJson(var4, IlliIIilllliIIil.class);
                  if (var5 != null && var5.IIIIIiIIil != null) {
                     var2.IlIlllIlilIl(var5);
                  }
               }
            }

            return var2;
         } else {
            return null;
         }
      } catch (Exception var6) {
         return null;
      }
   }

   public List<IlliIIilllliIIil> iliIiiliiiii() {
      return new ArrayList<>(this.llllIiIlIi.values());
   }

   public static float IIiilIiiiIii(float deg) {
      float var1 = deg % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public boolean IiIlliIliiIl(int dz, int dx, int dy) {
      return this.llllIiIlIi.remove(Long.valueOf(Ililllililil(dz, dx, dy))) != null;
   }

   public lIliIIliiIliIIli() {
      this.llllIiIlIi = new LinkedHashMap<>();
   }

   public static long Ililllililil(int dz, int dx, int dy) {
      return ((long)dz & 2097151L) << 42 | ((long)dx & 2097151L) << 21 | (long)dy & 2097151L;
   }

   public String IIlilIliiIli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIIllIIIl<"IIIIllIIIl","9nfTo3EU16+JfuTEn3Q+hH8PBQsI5wkSfzpknUXxN5fZ6Q==">(), 1);
      var1.addProperty(IIIIllIIIl<"IIIIllIIIl","7rwAAJDr9NoIocOejTlqkV0ZR3laEpgEspAaj9XE+AxB9ZyYmg==">(), this.lIllIiIlIi);
      var1.addProperty(IIIIllIIIl<"IIIIllIIIl","8K0mTkhn6AbKNhKYksUoZ8k0Q/0NR5ZikWB2Xq6WpwiHbM06">(), this.iIllIiIlIi);
      var1.addProperty(IIIIllIIIl<"IIIIllIIIl","rsOVb+vSWmUxA5eNZLRsSCGoDJkpoaK67N4X5f78fF40ZQ==">(), this.IlllIiIlIi);
      JsonArray var2 = new JsonArray();

      for (IlliIIilllliIIil var4 : this.llllIiIlIi.values()) {
         var2.add(lillIiIlIi.toJsonTree(var4));
      }

      var1.add(IIIIllIIIl<"IIIIllIIIl","r/oxYUcxWAR6K00eNh1/uFkn3PUbIOx/8Vz0sGpFJMLQOpA=">(), var2);
      return lillIiIlIi.toJson(var1);
   }

   public List<IlliIIilllliIIil> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for (IlliIIilllliIIil var3 : this.llllIiIlIi.values()) {
         if (var3.iIlIIiIIil) {
            var1.add(var3);
         }
      }

      return var1;
   }

   private static int IiIiliIiiiIi(int v) {
      return v << 11 >> 11;
   }

   public void IlIlllIlilIl(IlliIIilllliIIil e) {
      if (e != null) {
         long var2 = Ililllililil(e.IiiiilIIil, e.liiiilIIil, e.iiiiilIIil);
         this.llllIiIlIi.remove(Long.valueOf(var2));
         this.llllIiIlIi.put(Long.valueOf(var2), e);
      }
   }

   public String IliIlllilIi() {
      return this.lIllIiIlIi;
   }

   public static int IIIilIIiiIIi(long k) {
      return IiIiliIiiiIi((int)(k >> 21 & 2097151L));
   }

   public int IilliliilIIi() {
      return this.llllIiIlIi.size();
   }

   public void IIillIiliIil() {
      this.llllIiIlIi.clear();
   }

   public static double Iilililiiili(Integer rowKey, int recordedIndex, double recordedCount) {
      return rowKey != null ? (double)rowKey.intValue() : (double)recordedIndex + Math.max(0.0, recordedCount);
   }

   public static int IlIillIiilIi(long k) {
      return IiIiliIiiiIi((int)(k & 2097151L));
   }

   public boolean Illlllllilll(int dx, int dy, int dz) {
      return this.llllIiIlIi.containsKey(Long.valueOf(Ililllililil(dx, dy, dz)));
   }

   public int liiiIIllIl() {
      return this.iIllIiIlIi;
   }

   public static int Iiilliiliiil(long k) {
      return IiIiliIiiiIi((int)(k >> 42 & 2097151L));
   }

   public lIliIIliiIliIIli(String schematicName, int mirror, int rotation) {
      this.llllIiIlIi = new LinkedHashMap<>();
      this.lIllIiIlIi = schematicName == null ? "" : schematicName;
      this.iIllIiIlIi = mirror;
      this.IlllIiIlIi = rotation;
   }

   public int Iilllilliill(int dy, int dx, int dz) {
      long var9 = 1523770755513941158L;
      long var4 = Ililllililil(dy, dx, dz);
      var9 ^= (0L ^ var9) & -1L << 32;

      for (Long var8 : this.llllIiIlIi.keySet()) {
         if (var8 == var4) {
            return (int)(var9 >>> 32);
         }

         var9 += 4294967296L;
      }

      return -1;
   }

   public IlliIIilllliIIil IIlllIlliIll(int dz, int dy, int dx) {
      return this.llllIiIlIi.get(Ililllililil(dz, dy, dx));
   }

   public boolean lIiiIiIlilli() {
      return this.llllIiIlIi.isEmpty();
   }

   public boolean Iliilliiilii(String mir, int rot, int schematic) {
      return this.lIllIiIlIi.equals(mir == null ? "" : mir) && this.iIllIiIlIi == rot && this.IlllIiIlIi == schematic;
   }

   public int iIlIlllllill() {
      return this.IlllIiIlIi;
   }
}
