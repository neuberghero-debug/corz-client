package gg.corz;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1685;
import net.minecraft.class_1701;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class iiIiIiIlIIliIiIl extends ilIllIiIll {
   private static final int lllIlliIll = 80;
   private static final double IilIlliIll = 25.0;
   private static final long illIlliIll = 100L;
   private final Set<Integer> lilIlliIll = new HashSet<>();
   private long iilIlliIll;

   private class_2338 IlIllllIll(class_1665 arrow) {
      class_243 var2 = arrow.method_73189();
      class_243 var3 = arrow.method_18798();

      for (int var4 = 1; var4 <= 80; var4++) {
         class_243 var5 = var2;
         var2 = var2.method_1019(var3);
         var3 = this.ilIllIiIll(var5, var3);
         class_3965 var6 = this.liIlliiIll(var5, var2, arrow);
         if (var6.method_17783() != class_240.field_1333) {
            return this.IIllllIlll(var6);
         }

         if (var2.field_1351 < (double)(Iiiilllliiilll.field_1687.method_31607() - 2)) {
            break;
         }
      }

      return null;
   }

   @Override
   protected void Illillliilli() {
      this.lilIlliIll.clear();
      this.iilIlliIll = 0L;
   }

   public iiIiIiIlIIliIiIl() {
      super(IliIlllilIi<"IliIlllilIi","cO9VYyOKEoMhWMYnKffRWWFyJjPImKRXULrMOZXqiYEUuZix">(), lllIllillIll.liiIIIIiiiiIIIIi);
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         HashSet var1 = new HashSet();

         for (class_1297 var3 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var3 instanceof class_1665) {
               class_1665 var4 = (class_1665)var3;
               if (!(var4 instanceof class_1685) && var4.method_24921() == Iiiilllliiilll.field_1724) {
                  int var5 = var4.method_5628();
                  var1.add(var5);
                  if (!this.lilIlliIll.contains(var5) && this.iiiIlIIIll() && this.lIIlliIIll(var4)) {
                     class_2338 var6 = this.IlIllllIll(var4);
                     if (var6 != null) {
                        if (Iiiilllliiilll.field_1724.method_5707(class_243.method_24953(var6)) > 25.0) {
                           this.lilIlliIll.add(var5);
                        } else if (this.iIlllIllll(var6) || var4.method_24828()) {
                           this.lilIlliIll.add(var5);
                        }
                     }
                  }
               }
            }
         }

         this.lilIlliIll.retainAll(var1);
      }
   }

   @Override
   protected void Iilililiiili() {
      this.lilIlliIll.clear();
      this.iilIlliIll = 0L;
   }

   private void ilillIiill(int hotbarSlot) {
      long var3 = -8404000899944457532L;
      if (hotbarSlot >= 0
         && hotbarSlot <= (((845299348 - -67 >>> 3 | 845299348 - -67 << 29) << 19 | (845299348 - -67 >>> 3 | 845299348 - -67 << 29) >>> 13) ^ 1054290538)) {
         if (!Iiiilllliiilll.field_1724.method_31548().method_5438(hotbarSlot).method_31574(class_1802.field_8069)) {
            var3 ^= (
                  (long)this.iIIilIlIil(
                           class_1802.field_8069,
                           (--1427116284 * 954437177 >>> 19 | --1427116284 * 954437177 << 13) * -1527099483 ^ 806057135,
                           ~1622719757 * -95 ^ -460445674
                        )
                        << 32
                     ^ var3
               )
               & -1L << 32;
            if ((int)(var3 >>> 32) != (~(-(-579304155 ^ 27) * -799063683) ^ 1884304058)) {
               Iiiilllliiilll.field_1761
                  .method_2906(
                     Iiiilllliiilll.field_1724.field_7512.field_7763, (int)(var3 >>> 32), hotbarSlot, class_1713.field_7791, Iiiilllliiilll.field_1724
                  );
            }
         }
      }
   }

   private boolean liilliiill(class_2338 railPos) {
      class_238 var2 = new class_238(railPos).method_1009(0.2, 1.0, 0.2);

      for (class_1297 var4 : Iiiilllliiilll.field_1687.method_8335(null, var2)) {
         if (var4 instanceof class_1701) {
            return true;
         }
      }

      return false;
   }

   private class_2338 IIllllIlll(class_3965 hit) {
      class_2338 var2 = hit.method_17777();
      if (this.lllllillll(var2)) {
         return var2;
      } else {
         class_2338 var3 = hit.method_17780() == class_2350.field_11036 ? var2.method_10084() : var2;
         if (this.Iillllilll(var3)) {
            return var3;
         } else {
            class_2338 var4 = var2.method_10084();
            if (this.Iillllilll(var4)) {
               return var4;
            } else {
               class_2338 var5 = var2.method_10074();
               return this.Iillllilll(var5) ? var5 : null;
            }
         }
      }
   }

   private int iIIilIlIil(class_1792 item, int startInclusive, int endExclusive) {
      for (int var4 = startInclusive; var4 < endExclusive; var4++) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var4).method_31574(item)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean Iillllilll(class_2338 pos) {
      if (this.lllllillll(pos)) {
         return true;
      } else {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(pos);
         if (!this.iilllIIill(var2)) {
            return false;
         } else {
            class_2338 var3 = pos.method_10074();
            return Iiiilllliiilll.field_1687.method_8320(var3).method_26206(Iiiilllliiilll.field_1687, var3, class_2350.field_11036);
         }
      }
   }

   private boolean iIlllIllll(class_2338 placePos) {
      long var7 = 4625315733146751938L;
      long var9 = -4879544812018886337L;
      var7 ^= ((long)this.IIIillIIil(class_1802.field_8129) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)this.IIIillIIil(class_1802.field_8069) ^ var7) & -1L >>> 32;
      if ((int)(var7 >>> 32) != (2094101474 * -1047552999 ^ 107 ^ 263190150)
         && (int)var7 != (~((-1580474413 - 125 << 31 | -1580474413 - 125 >>> 1) - 85) ^ 1357246294)) {
         var9 ^= ((long)Iiiilllliiilll.field_1724.method_31548().method_67532() << 32 ^ var9) & -1L << 32;

         try {
            if (this.lllllillll(placePos) || this.lIilliIill(placePos, (int)(var7 >>> 32))) {
               if (this.liilliiill(placePos)) {
                  var9 ^= (1L ^ var9) & -1L >>> 32;
                  return (boolean)((int)var9);
               }

               if (System.currentTimeMillis() >= this.iilIlliIll) {
                  if (this.Ilillllill(placePos, (int)var7)) {
                     this.iilIlliIll = System.currentTimeMillis() + (-2681400694461910532L ^ -2681400694461910632L);
                     this.ilillIiill((int)var7);
                  }

                  var9 ^= ((long)this.liilliiill(placePos) ^ var9) & -1L >>> 32;
                  return (boolean)((int)var9);
               }

               var9 ^= (0L ^ var9) & -1L >>> 32;
               return (boolean)((int)var9);
            }

            var9 ^= (0L ^ var9) & -1L >>> 32;
         } finally {
            Iiiilllliiilll.field_1724.method_31548().method_61496((int)(var9 >>> 32));
         }

         return (boolean)((int)var9);
      } else {
         return false;
      }
   }

   private int IIIillIIil(class_1792 item) {
      return this.iIIilIlIil(item, 0, (-22551351 << 3 | -22551351 >>> 29) * 750576809 ^ -623729106);
   }

   private boolean lIIlliIIll(class_1665 arrow) {
      return !arrow.method_24828() && arrow.method_18798().method_1027() > Double.longBitsToDouble(-1025968449351063225L ^ -3541744916302943638L);
   }

   private boolean iiiIlIIIll() {
      return this.IIIillIIil(class_1802.field_8129) != (-961675503 - -49 ^ 19 ^ -97 ^ 49 ^ -961675520)
         && this.IIIillIIil(class_1802.field_8069) != (--944022362 * -750576809 ^ -1260126615);
   }

   private boolean Ilillllill(class_2338 cartSlot, int railPos) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(railPos);
      class_3965 var3 = new class_3965(
         new class_243(
            (double)cartSlot.method_10263() + Double.longBitsToDouble(3051033865634344401L ^ 1564845988602080721L),
            (double)cartSlot.method_10264() + Double.longBitsToDouble(-6132695224748319735L ^ -7699051875490369734L),
            (double)cartSlot.method_10260() + Double.longBitsToDouble(-1212723332782588618L ^ -3401472751684649674L)
         ),
         class_2350.field_11036,
         cartSlot,
         false
      );
      class_1269 var4 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3);
      if (var4.method_23665()) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         return true;
      } else {
         return false;
      }
   }

   private class_3965 liIlliiIll(class_243 start, class_243 end, class_1297 entity) {
      return Iiiilllliiilll.field_1687.method_17742(new class_3959(start, end, class_3960.field_17558, class_242.field_1348, entity));
   }

   private class_243 ilIllIiIll(class_243 motion, class_243 pos) {
      class_3610 var3 = Iiiilllliiilll.field_1687.method_8320(class_2338.method_49638(motion)).method_26227();
      double var4 = var3.method_15767(class_3486.field_15517)
         ? Double.longBitsToDouble(-4048865246835901332L ^ -563871680484028577L)
         : Double.longBitsToDouble(4325898647369705705L ^ 281197839788355399L);
      return pos.method_1021(var4).method_1031(0.0, Double.longBitsToDouble(7543186064632397358L ^ -2952287284834162764L), 0.0);
   }

   private boolean lIilliIill(class_2338 railSlot, int placePos) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(placePos);
      class_2338 var3 = railSlot.method_10074();
      class_3965 var4 = new class_3965(
         new class_243(
            (double)railSlot.method_10263() + Double.longBitsToDouble(5976876321262963329L ^ 7859380965503830657L),
            (double)railSlot.method_10264(),
            (double)railSlot.method_10260() + Double.longBitsToDouble(6403944908179944502L ^ 7439772822475158582L)
         ),
         class_2350.field_11036,
         var3,
         false
      );
      class_1269 var5 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var4);
      if (var5.method_23665()) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         return true;
      } else {
         return this.lllllillll(railSlot);
      }
   }

   private boolean iilllIIill(class_2680 state) {
      if (state.method_45474()) {
         return true;
      } else if (state.method_26164(class_3481.field_29823)) {
         return true;
      } else {
         return state.method_26164(class_3481.field_44469)
            ? true
            : state.method_27852(class_2246.field_10479)
               || state.method_27852(class_2246.field_10214)
               || state.method_27852(class_2246.field_10112)
               || state.method_27852(class_2246.field_10313)
               || state.method_27852(class_2246.field_10428)
               || state.method_27852(class_2246.field_10597)
               || state.method_27852(class_2246.field_10477);
      }
   }

   private boolean lllllillll(class_2338 pos) {
      return Iiiilllliiilll.field_1687.method_8320(pos).method_26164(class_3481.field_15463);
   }
}
