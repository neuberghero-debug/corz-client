package gg.corz;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1959;
import net.minecraft.class_2338;
import net.minecraft.class_2378;
import net.minecraft.class_2791;
import net.minecraft.class_2919;
import net.minecraft.class_4538;
import net.minecraft.class_5321;
import net.minecraft.class_5450;
import net.minecraft.class_5455;
import net.minecraft.class_5819;
import net.minecraft.class_5820;
import net.minecraft.class_5857;
import net.minecraft.class_5925;
import net.minecraft.class_6017;
import net.minecraft.class_6795;
import net.minecraft.class_6796;
import net.minecraft.class_6797;
import net.minecraft.class_6799;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.minecraft.class_2902.class_2903;

public final class IilIiililIii {
   private class_2378<class_6796> ilIiIilIlIiIiIilIl;
   private Map<class_5321<class_6796>, int[]> IlIiIilIlllIiIilIl;
   private class_5455 lIIiIilIliIIiIilIl;

   private boolean Illlllllilll(List<class_6880<class_6796>> e, class_6880<class_6796> list) {
      Optional var3 = list.method_40230();
      if (var3.isEmpty()) {
         return e.contains(list);
      } else {
         for (class_6880 var5 : e) {
            if (var5.method_40230().map(key -> key == var3.get()).orElse(false)) {
               return true;
            }
         }

         return false;
      }
   }

   private class_2903 IIIllIIliIIl(class_2903 t) {
      if (t == null) {
         return class_2903.field_13202;
      } else {
         switch (t) {
            case field_13194:
               return class_2903.field_13202;
            case field_13195:
               return class_2903.field_13200;
            default:
               return t;
         }
      }
   }

   private List<class_6797> IlIlllIlilIl(class_6796 feature) {
      try {
         for (Field var5 : feature.getClass().getDeclaredFields()) {
            if (List.class.isAssignableFrom(var5.getType())) {
               var5.setAccessible(true);
               Object var6 = var5.get(feature);
               if (var6 instanceof List var7 && (var7.isEmpty() || var7.get(0) instanceof class_6797)) {
                  return (List<class_6797>)var6;
               }
            }
         }
      } catch (Throwable var8) {
      }

      return null;
   }

   private void IiIlliIliiIl(class_5455 mgr) {
      if (mgr != this.lIIiIilIliIIiIilIl || this.IlIiIilIlllIiIilIl == null) {
         this.lIIiIilIliIIiIilIl = mgr;
         this.IlIiIilIlllIiIilIl = new HashMap<>();

         try {
            this.ilIiIilIlIiIiIilIl = mgr.method_30530(class_7924.field_41245);
            class_2378 var2 = mgr.method_30530(class_7924.field_41236);
            ArrayList var3 = new ArrayList();

            for (class_1959 var5 : var2) {
               List var6 = var5.method_30970().method_30983();

               for (int var7 = 0; var7 < var6.size(); var7++) {
                  while (var3.size() <= var7) {
                     var3.add(new ArrayList());
                  }

                  List var8 = (List)var3.get(var7);
                  Object var9 = var6.get(var7);

                  for (class_6880 var11 : this.IIlllIlliIll(var9)) {
                     if (!this.Illlllllilll(var8, var11)) {
                        var8.add(var11);
                     }
                  }
               }
            }

            for (int var13 = 0; var13 < var3.size(); var13++) {
               List var14 = (List)var3.get(var13);

               for (int var15 = 0; var15 < var14.size(); var15++) {
                  int var16 = var13;
                  int var17 = var15;
                  ((class_6880)var14.get(var15))
                     .method_40230()
                     .ifPresent(k -> this.IlIiIilIlllIiIilIl.putIfAbsent((class_5321<class_6796>)k, new int[]{var16, var17}));
               }
            }
         } catch (Throwable var12) {
         }
      }
   }

   public static Long IliIlllilIi(String text) {
      if (text == null) {
         return null;
      } else {
         String var1 = text.trim();
         if (var1.isEmpty()) {
            return null;
         } else {
            try {
               return Long.parseLong(var1);
            } catch (NumberFormatException var3) {
               return (long)var1.hashCode();
            }
         }
      }
   }

   private Iterable<class_6880<class_6796>> IIlllIlliIll(Object entryList) {
      if (entryList instanceof Iterable var2) {
         ArrayList var3 = new ArrayList();

         for (Object var5 : var2) {
            if (var5 instanceof class_6880 var6) {
               var3.add(var6);
            }
         }

         return var3;
      } else {
         return List.of();
      }
   }

   private int IilliliilIIi(class_6797 mod, class_5819 rng) {
      try {
         for (Field var6 : mod.getClass().getDeclaredFields()) {
            if (class_6017.class.isAssignableFrom(var6.getType())) {
               var6.setAccessible(true);
               if (var6.get(mod) instanceof class_6017 var8) {
                  return Math.max(0, var8.method_35008(rng));
               }
            }
         }

         int var10 = this.lIiiIiIlilli(mod);
         if (var10 > 0) {
            return var10;
         }
      } catch (Throwable var9) {
      }

      return 1;
   }

   private void iIlIlllllill(class_6797 rng, class_5819 out, class_2338 world, class_4538 mod, List<class_2338> pos) {
      if (!(rng instanceof class_5857)) {
         if (rng instanceof class_6799) {
            int var12 = this.lIiiIiIlilli(rng);
            if (var12 > 0 && out.method_43057() < 1.0F / (float)var12) {
               pos.add(world);
            }
         } else if (rng instanceof class_5450) {
            int var11 = world.method_10263() + out.method_43048(16);
            int var15 = world.method_10260() + out.method_43048(16);
            pos.add(new class_2338(var11, world.method_10264(), var15));
         } else if (rng instanceof class_5925) {
            class_2903 var10 = this.IIIllIIliIIl(this.iliIiiliiiii(rng));
            class_2791 var14 = mod.method_8392(world.method_10263() >> 4, world.method_10260() >> 4);
            int var8 = var14.method_12005(var10, world.method_10263(), world.method_10260());
            pos.add(new class_2338(world.method_10263(), var8, world.method_10260()));
         } else if (rng instanceof class_6795) {
            int var9 = mod.method_31607();
            int var13 = Math.max(1, mod.method_31605());
            pos.add(new class_2338(world.method_10263(), var9 + out.method_43048(var13), world.method_10260()));
         } else {
            pos.add(world);
         }
      } else {
         int var6 = this.IilliliilIIi(rng, out);

         for (int var7 = 0; var7 < var6; var7++) {
            pos.add(world);
         }
      }
   }

   private int lIiiIiIlilli(class_6797 mod) {
      try {
         for (Field var5 : mod.getClass().getDeclaredFields()) {
            if (var5.getType() == int.class) {
               var5.setAccessible(true);
               return var5.getInt(mod);
            }
         }
      } catch (Throwable var6) {
      }

      return 0;
   }

   public List<class_2338> liiiIIllIl(class_4538 mgr, class_5455 world, long featureKey, int chunkZ, int chunkX, class_5321<class_6796> worldSeed) {
      ArrayList var8 = new ArrayList();

      try {
         this.IiIlliIliiIl(world);
         if (this.ilIiIilIlIiIiIilIl == null) {
            return var8;
         }

         int[] var9 = this.IlIiIilIlllIiIilIl.get(worldSeed);
         if (var9 == null) {
            return var8;
         }

         class_6796 var10 = (class_6796)this.ilIiIilIlIiIiIilIl.method_29107(worldSeed);
         if (var10 == null) {
            return var8;
         }

         List var11 = this.IlIlllIlilIl(var10);
         if (var11 == null) {
            return var8;
         }

         int var12 = chunkZ << 4;
         int var13 = chunkX << 4;
         class_2919 var14 = new class_2919(new class_5820(0L));
         long var15 = var14.method_12661(featureKey, var12, var13);
         var14.method_12664(var15, var9[1], var9[0]);
         ArrayList var17 = new ArrayList();
         var17.add(new class_2338(var12, 0, var13));

         for (class_6797 var19 : var11) {
            ArrayList var20 = new ArrayList();

            for (class_2338 var22 : var17) {
               this.iIlIlllllill(var19, var14, var22, mgr, var20);
            }

            var17 = var20;
            if (var20.isEmpty()) {
               break;
            }
         }

         var8.addAll(var17);
      } catch (Throwable var23) {
      }

      return var8;
   }

   private class_2903 iliIiiliiiii(class_6797 mod) {
      try {
         for (Field var5 : mod.getClass().getDeclaredFields()) {
            if (var5.getType() == class_2903.class) {
               var5.setAccessible(true);
               return (class_2903)var5.get(mod);
            }
         }
      } catch (Throwable var6) {
      }

      return class_2903.field_13202;
   }
}
