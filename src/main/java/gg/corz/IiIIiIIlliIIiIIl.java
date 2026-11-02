package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import net.minecraft.class_1297;
import net.minecraft.class_1701;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2258;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_3922;
import net.minecraft.class_2338.class_2339;

public final class IiIIiIIlliIIiIIl implements lIilIiliIilIil {
   private final Long2ObjectOpenHashMap<class_2818> iillIIilIl;
   private class_1937 iIilIIilIl;
   private final class_2339 lIilIIilIl;
   private long IlilIIilIl;
   private final LongOpenHashSet IIilIIilIl;
   private final Long2IntOpenHashMap lillIIilIl = new Long2IntOpenHashMap(~(627620389 - -51) ^ -627616345);
   public static final float IillIIilIl = 6.0F;

   public void Illlllllilll(int z, int r, int y, int x) {
      if (this.iIilIIilIl != null) {
         class_238 var5 = new class_238((double)(z - x), (double)(r - x), (double)(y - x), (double)(z + x + 1), (double)(r + x + 1), (double)(y + x + 1));

         for (class_1701 var7 : this.iIilIIilIl.method_8390(class_1701.class, var5, class_1297::method_5805)) {
            long var8 = var7.method_24515().method_10063();
            if (this.IIilIIilIl.add(var8)) {
               this.lillIIilIl.remove(var8);
            }
         }
      }
   }

   public class_1937 IIlllIlliIll() {
      return this.iIilIIilIl;
   }

   public void IlIlllIlilIl(class_1937 w, long nowTick) {
      if (w != this.iIilIIilIl || nowTick != this.IlilIIilIl) {
         this.lillIIilIl.clear();
         this.iillIIilIl.clear();
         this.IIilIIilIl.clear();
         this.iIilIIilIl = w;
         this.IlilIIilIl = nowTick;
      }
   }

   private int Iilllilliill(int y, int x, int z, long key) {
      if (x >= this.iIilIIilIl.method_31607() && x <= this.iIilIIilIl.method_31600()) {
         class_2818 var6 = this.IIillIiliIil(y >> 4, z >> 4);
         if (var6 == null) {
            return 257;
         } else {
            this.lIilIIilIl.method_10103(y, x, z);
            class_2680 var7 = var6.method_8320(this.lIilIIilIl);
            int var8 = Ililllililil(this.iIilIIilIl, this.lIilIIilIl, var7);
            if (this.IIilIIilIl.contains(key)) {
               var8 |= 16;
            }

            return var8;
         }
      } else {
         return x < this.iIilIIilIl.method_31607() ? 257 : 0;
      }
   }

   public void IiIlliIliiIl() {
      this.lillIIilIl.clear();
      this.iillIIilIl.clear();
   }

   public IiIIiIIlliIIiIIl() {
      this.iillIIilIl = new Long2ObjectOpenHashMap();
      this.IIilIIilIl = new LongOpenHashSet();
      this.lIilIIilIl = new class_2339();
      this.IlilIIilIl = -6424886792295802971L ^ 2798485244558972837L;
      this.lillIIilIl.defaultReturnValue(-1);
   }

   public static int Ililllililil(class_1937 w, class_2338 pos, class_2680 s) {
      short var3 = 0;
      if (!s.method_26215() && !s.method_26220(w, pos).method_1110()) {
         var3 |= 1;
      }

      class_3610 var4 = s.method_26227();
      if (!var4.method_15769()) {
         if (var4.method_15767(class_3486.field_15518)) {
            var3 |= 2;
         }

         if (var4.method_15767(class_3486.field_15517)) {
            var3 |= 4;
         }
      }

      if (s.method_26215()) {
         return var3;
      } else {
         class_2248 var5 = s.method_26204();
         if (s.method_26164(class_3481.field_21952)
            || class_3922.method_23896(s)
            || var5 == class_2246.field_10092
            || var5 == class_2246.field_27879
            || var5 == class_2246.field_10029
            || var5 == class_2246.field_16999
            || var5 == class_2246.field_10343
            || var5 == class_2246.field_10606
            || var5 == class_2246.field_10422 && (Boolean)s.method_11654(class_2258.field_10680)) {
            var3 |= 8;
         }

         if (var5 == class_2246.field_10375
            || var5 == class_2246.field_10282
            || var5 == class_2246.field_10348
            || var5 == class_2246.field_10589
            || var5 == class_2246.field_22422
            || var5 == class_2246.field_28108
            || var5 == class_2246.field_43231
            || s.method_26164(class_3481.field_24076)) {
            var3 |= 16;
         }

         if (var5 == class_2246.field_23152) {
            var3 |= 128;
         }

         if (s.method_31709()) {
            var3 |= 64;
         }

         if (var5 == class_2246.field_10540 || var5 == class_2246.field_22423 || var5 == class_2246.field_9987 || var5 == class_2246.field_38420) {
            var3 |= 32;
         } else if ((var3 & 1) != 0) {
            float var6 = s.method_26214(w, pos);
            if (var6 < 0.0F || var6 > 6.0F) {
               var3 |= 32;
            }
         }

         return var3;
      }
   }

   @Override
   public int IliIlllilIi(int y, int x, int z) {
      long var7 = 4090535144475247961L;
      if (this.iIilIIilIl == null) {
         return ~(-2055003071) ^ 2055002815;
      } else {
         long var4 = class_2338.method_10064(y, x, z);
         var7 ^= ((long)this.lillIIilIl.get(var4) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) >= 0) {
            return (int)(var7 >>> 32);
         } else {
            var7 ^= ((long)this.Iilllilliill(y, x, z, var4) << 32 ^ var7) & -1L << 32;
            this.lillIIilIl.put(var4, (int)(var7 >>> 32));
            return (int)(var7 >>> 32);
         }
      }
   }

   private class_2818 IIillIiliIil(int cx, int cz) {
      long var3 = class_1923.method_8331(cx, cz);
      class_2818 var5 = (class_2818)this.iillIIilIl.get(var3);
      if (var5 == null && !this.iillIIilIl.containsKey(var3)) {
         var5 = this.iIilIIilIl.method_8398().method_21730(cx, cz);
         this.iillIIilIl.put(var3, var5);
      }

      return var5;
   }
}
