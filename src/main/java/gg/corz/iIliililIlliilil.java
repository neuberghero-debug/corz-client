package gg.corz;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public final class iIliililIlliilil {
   private final Map<String, illIilIiIilIilIi> ilIlllllil;
   private final Map<String, Float> llIlllllil = new HashMap<>();

   public float IlIlllIlilIl(String key) {
      Float var2 = this.llIlllllil.get(key);
      return var2 == null ? 0.0F : var2;
   }

   public void iIlIlllllill(String id) {
      this.IliIlllilIi(id).liIIIllIIi = System.nanoTime();
   }

   public float IilliliilIIi(String id, float depth) {
      illIilIiIilIilIi var3 = this.ilIlllllil.get(id);
      if (var3 != null && (var3.IiIIIllIIi != 0L || var3.liIIIllIIi != 0L)) {
         long var4 = System.nanoTime();
         float var6 = 1.0F;
         if (var3.IiIIIllIIi != 0L) {
            float var7 = (float)(var4 - var3.IiIIIllIIi) / 1.8E8F;
            if (var7 >= 1.0F) {
               var3.IiIIIllIIi = 0L;
            } else if (var7 > 0.0F) {
               var6 *= 1.0F - depth * llilliilililliil.lIiiIiIlilli(var7);
            }
         }

         if (var3.liIIIllIIi != 0L) {
            float var8 = (float)(var4 - var3.liIIIllIIi) / 2.4E8F;
            if (var8 >= 1.0F) {
               var3.liIIIllIIi = 0L;
            } else if (var8 > 0.0F) {
               var6 *= 1.0F + 0.07F * (float)Math.sin(Math.PI * (double)llilliilililliil.liiiIIllIl(var8));
            }
         }

         return var6;
      } else {
         return 1.0F;
      }
   }

   public float lIiiIiIlilli(String key, float rate, float initial, float target) {
      Float var5 = this.llIlllllil.get(key);
      float var6 = var5 == null
         ? rate
         : (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)var5.floatValue(), (double)initial, (double)target, llIilillilIilill.liiiIIllIl());
      if (Math.abs(var6 - initial) < 0.002F) {
         var6 = initial;
      }

      this.llIlllllil.put(key, var6);
      return var6;
   }

   public iIliililIlliilil() {
      this.ilIlllllil = new HashMap<>();
   }

   public void IiIlliIliiIl(String value, float key) {
      this.llIlllllil.put(value, key);
   }

   public void liiiIIllIl(String id) {
      this.IliIlllilIi(id).IiIIIllIIi = System.nanoTime();
   }

   public float iliIiiliiiii(String target, float rate, float key) {
      return this.lIiiIiIlilli(target, rate, rate, key);
   }

   public float IIIllIIliIIl(String on, boolean key) {
      return this.lIiiIiIlilli(on, 0.0F, key ? 1.0F : 0.0F, key ? 16.0F : 11.0F);
   }

   private illIilIiIilIilIi IliIlllilIi(String id) {
      illIilIiIilIilIi var2 = this.ilIlllllil.get(id);
      if (var2 == null) {
         var2 = new illIilIiIilIilIi();
         this.ilIlllllil.put(id, var2);
      }

      return var2;
   }

   public void IIlllIlliIll(Predicate<String> keep) {
      this.llIlllllil.keySet().removeIf(keepx -> !keep.test(keepx));
      this.ilIlllllil.keySet().removeIf(keepx -> !keep.test(keepx));
   }
}
