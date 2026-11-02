package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3481;

public final class lllIilIlillIilIl implements liiiiIiiiiiiIi {
   private final Long2ObjectOpenHashMap<class_2680> iIIlillIll = new Long2ObjectOpenHashMap();
   private class_1937 IlIlillIll;
   public static final int lIIlillIll = 4096;

   @Override
   public float IilliliilIIi(class_2338 p) {
      return this.IIIilIIiiIIi(p).method_26204().method_9520();
   }

   public lllIilIlillIilIl IIillIiliIil(class_1937 w) {
      this.IlIlillIll = w;
      this.iIIlillIll.clear();
      return this;
   }

   @Override
   public boolean liiiIIllIl(class_2338 p) {
      return !this.IIIilIIiiIIi(p).method_26227().method_15769();
   }

   @Override
   public int iliIiiliiiii(class_2338 p) {
      class_2680 var2 = this.IIIilIIiiIIi(p);
      if (!var2.method_26164(class_3481.field_33715)) {
         return 0;
      } else {
         return !var2.method_26164(class_3481.field_33717) && !var2.method_26164(class_3481.field_33718) ? 1 : 2;
      }
   }

   public void Ililllililil(class_2338 p) {
      if (p != null) {
         this.iIIlillIll.remove(p.method_10063());
      }
   }

   @Override
   public boolean IliIlllilIi(class_2338 p) {
      class_2680 var2 = this.IIIilIIiiIIi(p);
      return var2.method_26215() || var2.method_26220(this.IlIlillIll, p).method_1110();
   }

   @Override
   public float iIlIlllllill(class_2338 p) {
      return this.IIIilIIiiIIi(p).method_26214(this.IlIlillIll, p);
   }

   @Override
   public boolean IIIllIIliIIl(class_2338 p) {
      class_2680 var2 = this.IIIilIIiiIIi(p);
      return var2.method_27852(class_2246.field_10540) || var2.method_27852(class_2246.field_9987);
   }

   @Override
   public boolean IlIlllIlilIl(class_2338 p) {
      class_2680 var2 = this.IIIilIIiiIIi(p);
      return !var2.method_26215() && var2.method_26206(this.IlIlillIll, p, class_2350.field_11036);
   }

   private class_2680 IIIilIIiiIIi(class_2338 p) {
      if (this.IlIlillIll != null && p != null) {
         long var2 = p.method_10063();
         class_2680 var4 = (class_2680)this.iIIlillIll.get(var2);
         if (var4 == null) {
            if (this.iIIlillIll.size() >= 4096) {
               this.iIIlillIll.clear();
            }

            var4 = this.IlIlillIll.method_8320(p);
            this.iIIlillIll.put(var2, var4);
         }

         return var4;
      } else {
         return class_2246.field_10124.method_9564();
      }
   }

   @Override
   public boolean IiIlliIliiIl(class_2338 p) {
      return this.IIIilIIiiIIi(p).method_45474();
   }

   public class_1937 Iiilliiliiil() {
      return this.IlIlillIll;
   }

   @Override
   public boolean lIiiIiIlilli(class_2338 p) {
      return this.IIIilIIiiIIi(p).method_29291();
   }
}
