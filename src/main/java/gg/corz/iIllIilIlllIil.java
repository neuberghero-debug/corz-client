package gg.corz;

import java.util.HashMap;
import java.util.Map;

public final class iIllIilIlllIil {
   public static final float iilIIIiIiIIiIIIiIi = 180.0F;
   public static final float IilIIIiIililIIIiIi = 11.0F;
   public static final float lllIIIiIiillIIIiIi = 16.0F;
   private final Map<String, float[]> IliIIIiIilliIIIiIi = new HashMap<>();
   private final Map<String, long[]> iliIIIiIiIiiIIIiIi = new HashMap<>();
   public static final float lIiIIIiIiiIiIIIiIi = 0.05F;
   private float liiIIIiIiiiiIIIiIi;

   public float liiiIIllIl() {
      return this.liiIIIiIiiiiIIIiIi;
   }

   public void IliIlllilIi(float dtSeconds) {
      this.liiIIIiIiiiiIIIiIi = dtSeconds < 0.0F ? 0.0F : Math.min(0.05F, dtSeconds);
   }

   public void IIlllIlliIll() {
      this.IliIIIiIilliIIIiIi.clear();
      this.iliIIIiIiIiiIIIiIi.clear();
   }

   public void IIIllIIliIIl(String value, float key) {
      float[] var3 = this.IliIIIiIilliIIIiIi.get(value);
      if (var3 == null) {
         this.IliIIIiIilliIIIiIi.put(value, new float[]{key});
      } else {
         var3[0] = key;
      }
   }

   public float iIlIlllllill(String target, float initial, float key, float rate) {
      float[] var5 = this.IliIIIiIilliIIIiIi.get(target);
      if (var5 == null) {
         var5 = new float[]{initial};
         this.IliIIIiIilliIIIiIi.put(target, var5);
      }

      var5[0] = lliiiIliliiiIl.IIIllIIliIIl(var5[0], key, rate, this.liiIIIiIiiiiIIIiIi, 0.002F);
      return var5[0];
   }

   public float iliIiiliiiii(String key) {
      float[] var2 = this.IliIIIiIilliIIIiIi.get(key);
      return var2 == null ? 0.0F : var2[0];
   }

   public void IlIlllIlilIl(String key) {
      long[] var2 = this.iliIIIiIiIiiIIIiIi.get(key);
      if (var2 == null) {
         this.iliIIIiIiIiiIIIiIi.put(key, new long[]{System.nanoTime()});
      } else {
         var2[0] = System.nanoTime();
      }
   }

   public float IiIlliIliiIl(String key, float depth) {
      long[] var3 = this.iliIIIiIiIiiIIIiIi.get(key);
      if (var3 != null && var3[0] != 0L) {
         float var4 = (float)(System.nanoTime() - var3[0]) / 1000000.0F / 180.0F;
         if (var4 >= 1.0F) {
            var3[0] = 0L;
            return 1.0F;
         } else {
            return 1.0F - depth * lliiiIliliiiIl.Iliilliiilii(var4);
         }
      } else {
         return 1.0F;
      }
   }

   public float lIiiIiIlilli(String key, boolean on) {
      return this.iIlIlllllill(key, 0.0F, on ? 1.0F : 0.0F, on ? 16.0F : 11.0F);
   }

   public float IilliliilIIi(String rate, float target, float key) {
      return this.iIlIlllllill(rate, target, target, key);
   }
}
