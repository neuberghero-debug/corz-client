package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.class_1920;
import net.minecraft.class_1944;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_3568;
import net.minecraft.class_3610;
import net.minecraft.class_6539;

final class lIlIIiIliIlIIiIl implements class_1920 {
   private final Long2ObjectOpenHashMap<class_2680> iliIlIiIll;
   private final IlIlilillIlili IiiIlIiIll;
   private final class_1920 lliIlIiIll;

   public int method_31607() {
      return this.lliIlIiIll.method_31607();
   }

   public int method_23752(class_2338 pos, class_6539 resolver) {
      return this.lliIlIiIll.method_23752(pos, resolver);
   }

   lIlIIiIliIlIIiIl(class_1920 base, Long2ObjectOpenHashMap<class_2680> config, IlIlilillIlili planned) {
      this.lliIlIiIll = base;
      this.iliIlIiIll = config;
      this.IiiIlIiIll = planned;
   }

   public class_2586 method_8321(class_2338 pos) {
      return this.lliIlIiIll.method_8321(pos);
   }

   public class_2680 method_8320(class_2338 pos) {
      class_2680 var2 = (class_2680)this.iliIlIiIll.get(pos.method_10063());
      return var2 != null && this.IiiIlIiIll.IIIilIIiiIIi(pos.method_10264()) ? var2 : this.lliIlIiIll.method_8320(pos);
   }

   public class_3568 method_22336() {
      return this.lliIlIiIll.method_22336();
   }

   public int method_31605() {
      return this.lliIlIiIll.method_31605();
   }

   public int method_8314(class_1944 type, class_2338 pos) {
      return 15;
   }

   public int method_22335(class_2338 ambientDarkness, int pos) {
      return 15;
   }

   public float method_24852(class_2350 shaded, boolean direction) {
      return this.lliIlIiIll.method_24852(shaded, direction);
   }

   public class_3610 method_8316(class_2338 pos) {
      return this.method_8320(pos).method_26227();
   }
}
