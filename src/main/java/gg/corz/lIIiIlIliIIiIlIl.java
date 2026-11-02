package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10707;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_9362;

public class lIIiIlIliIIiIlIl extends ilIllIiIll implements lilIliiiilIlii, liliIiliiliIil, ilIIIiiIiIIIii {
   static final String illIIIIiIl = "Pause";
   private final liiIlIIliiiIlIIl llIlIIIiIl;
   static final long iIiIIIIiIl = 75L;
   private final iilliIlIIiliIl lIIlIIIiIl;
   static final int IiiIIIIiIl = 3;
   private long ilIlIIIiIl;
   static final int IIiIIIIiIl = 2;
   private final lliliIIiililiIIi iIIlIIIiIl;
   static final int iliIIIIiIl = 20;
   private long IiIlIIIiIl;
   private int liIlIIIiIl;
   static final long IliIIIIiIl = 100L;
   private static final lilllliiilllli iiiIIIIiIl = new lilllliiilllli(true, true, true, true, true, true);
   private final iIliiiIiIlliiiIi IlIlIIIiIl;
   static final int liiIIIIiIl = Integer.MIN_VALUE;
   static final long lliIIIIiIl = 1000L;
   static final int lIiIIIIiIl = 10;
   private long iiIlIIIiIl;
   static final String iilIIIIiIl = "Critical Hits";
   private final lliliIIiililiIIi IIIlIIIiIl = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","YVPnVmkGP75fmgBMvcNwC8LOTzynXiS4Ewn1fSTqrXE=">(),
      IliIlllilIi<"IliIlllilIi","76Sz+htuM38Xq2WoIb+93TkC+o3pNJBDdIEm34L2pTKo1iO4x4/RR746sMWIwgq1ifYhuMyr6LvsW0ts2iwF3K9kHpYyP5mxubdztz0rv32VoRKuBzCGxWDyRa0TUczIWFQ8pStCjA5Vtrvq/xUKjC3RANqXn815ARboUU3EoilxC57cMOklAMESYNC6jJJrD6dhTkv+X204GxKx4g==">(),
      IliIlllilIi<"IliIlllilIi","ec6vcbrUEMU1Qf7p93kDqz6RxOFBbx87G81SWORhd2DU">(),
      IliIlllilIi<"IliIlllilIi","ec6vcbrUEMU1Qf7p93kDqz6RxOFBbx87G81SWORhd2DU">(),
      IliIlllilIi<"IliIlllilIi","L/u86JClWemGagbXiB94zniH1bQTESM+Udz1l5DEXAPbnw==">()
   );
   static final String lilIIIIiIl = "KB Reduction";
   static final String IilIIIIiIl = "Normal";

   @Override
   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 == null) {
         this.IiIilliIil();
      } else {
         this.llIlIIIiIl.liiiIIllIl(var1.method_24828());
      }
   }

   static boolean Illillllil(long hurtMs, long averageHitDelayMs, long now, long sentMs) {
      if (hurtMs >= (6819962821474803304L ^ 6819962821474803304L) && averageHitDelayMs < hurtMs) {
         long var8 = Math.max(
            1604569925304684884L ^ 1604569925304684848L,
            Math.min(3890081968263757472L ^ 3890081968263757128L, sentMs + (9094284700497295977L ^ 9094284700497295906L))
         );
         return now - hurtMs < var8;
      } else {
         return false;
      }
   }

   private static boolean liilliiill(class_746 target, class_1309 player) {
      if (!player.method_6115()) {
         return false;
      } else {
         class_10707 var2 = (class_10707)player.method_6030().method_58694(class_9334.field_56396);
         if (var2 == null) {
            return false;
         } else if (!iIiilIliil(player.method_6048(), illIllilIilIllil.IlIlllIlilIl(), var2.method_67197())) {
            return false;
         } else {
            class_243 var3 = player.method_5631(0.0F, player.method_5791());
            return lliililiil(var3.field_1352, var3.field_1350, target.method_23317() - player.method_23317(), target.method_23321() - player.method_23321());
         }
      }
   }

   static boolean lIliliIlil(double velocityX, double toTargetX, double velocityZ, double toTargetZ) {
      return velocityX * velocityZ + toTargetX * toTargetZ > Double.longBitsToDouble(-302376747448100551L ^ -302376747448100551L);
   }

   @Override
   protected void Iilililiiili() {
      this.IiIilliIil();
   }

   static int lililiilil(int ticksSinceHurt, int mirroredTicks) {
      return Math.max(ticksSinceHurt, illilIilil(mirroredTicks));
   }

   private static boolean IIIillIIil(class_746 player) {
      if (!class_9362.method_58659(player)) {
         return false;
      } else {
         for (int var1 = 0; var1 < class_1661.method_7368(); var1++) {
            if (player.method_31548().method_5438(var1).method_7909() instanceof class_9362) {
               return true;
            }
         }

         return false;
      }
   }

   private static int Ilillllill(class_1309 target) {
      return lililiilil(illIllilIilIllil.Ililllililil(target), illIllilIilIllil.Iilllilliill(target.method_5628()));
   }

   @Override
   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var9 = 3025966151482710418L;
      if (!(presser instanceof class_1309 var3)) {
         return iilllIllIIillIll.ilIIIIilll;
      } else {
         class_746 var4 = Iiiilllliiilll.field_1724;
         if (var4 == null || !liiIIIlliiiIIIll.IliIlllilIi(presser, iiiIIIIiIl) || IIIillIIil(var4)) {
            return iilllIllIIillIll.ilIIIIilll;
         } else if (liilliiill(var4, var3)) {
            return iilllIllIIillIll.ilIIIIilll;
         } else {
            long var5 = IIIiillllIIiilll.IliIlllilIi();
            var9 ^= ((long)IliIlllilIi<"IliIlllilIi","L/u86JClWemGagbXiB94zniH1bQTESM+Udz1l5DEXAPbnw==">().equals(this.IIIlIIIiIl.Iilllilliill()) << 32 ^ var9)
               & -1L << 32;
            var9 ^= ((long)((int)(var9 >>> 32) != 0 ? this.Iillllilll(var4, var3, var5) : this.lllllillll(var4, var3, var5)) ^ var9) & -1L >>> 32;
            if ((int)var9 == 0) {
               return iilllIllIIillIll.ilIIIIilll;
            } else {
               if ((int)(var9 >>> 32) != 0) {
                  this.ilIlIIIiIl = IIllIIlilIllIIli.IlIlllIlilIl();
                  if (target == null || target == IIllIIlilIllIIli.IilliliilIIi()) {
                     iIIilIlIil(var4, var3);
                  }
               }

               return iilllIllIIillIll.IiIIIIilll;
            }
         }
      }
   }

   public lIIiIlIliIIiIlIl() {
      super(IliIlllilIi<"IliIlllilIi","eeFwm9ruQS/tmGOeVjCFlGTn82R6WokAYA85CHJIGpO/HA0Bh24=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lIIlIIIiIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","/2HuI5KoTNyH3vwkrt3o13RKwf38jNvNR1pULFHB5MUfnQ==">(),
         IliIlllilIi<"IliIlllilIi","G9a7f6xz+49ORcdIQJ2zFZJbNHE+0CfVbn/QMH7kjWr22CyLLxMkKJDwqDqScs6PO+Y2HLGaIzaChLsa/SqcJ2oI8IsrhWJJHUTf4gPm18BVYBnUOlpUiNf1ZMv5Ldh3jcDA1/S6X30qMDeKmQ==">(),
         90,
         0,
         100
      );
      this.iIIlIIIiIl = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","5SDEXHD3+aMw7zLYuRJUDlFDwSGQnNYDUVYN96nsf4fFfVqmlh4=">(),
         IliIlllilIi<"IliIlllilIi","LRoMcrBSXedXL7Gwt0Av4gLjOukSaI+eJy/RWsKANdUo36ty+6M8OLEaM4kY3fhr9obfUAsOCSZVcIm+DlGFat6Nm+nfsK4sLr/ogWUB34wLf+P7LIwRbY9DU+4Ekpux0OkFZ5wZXQgP9i6qTL0pIMdQwiRAI0exfcvkhzSH/QbB6AhpLkZnXLcyb3U=">(),
         IliIlllilIi<"IliIlllilIi","met1lNoeZSKbXSqvxGp4EXRcBLha0ooVMKB+3cHoZoMBSmC3PinzzA==">(),
         IliIlllilIi<"IliIlllilIi","met1lNoeZSKbXSqvxGp4EXRcBLha0ooVMKB+3cHoZoMBSmC3PinzzA==">(),
         IliIlllilIi<"IliIlllilIi","VrMmsQKNTDLMNNGEoMjNE27njRZQ1BlCwEArspSCFC4thQ/o/m0Mpo0=">()
      );
      this.IlIlIIIiIl = new iIliiiIiIlliiiIi();
      this.llIlIIIiIl = new liiIlIIliiiIlIIl();
      this.ilIlIIIiIl = Long.MIN_VALUE;
      this.IiIlIIIiIl = -1L;
      this.liIlIIIiIl = Integer.MIN_VALUE;
      this.iiIlIIIiIl = -1L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIlIIIiIl, this.lIIlIIIiIl, this.iIIlIIIiIl});
   }

   static boolean iIiilIliil(int blockDelayTicks, int marginTicks, int useTicks) {
      return blockDelayTicks + Math.max(0, marginTicks) >= useTicks;
   }

   @Override
   protected void Illillliilli() {
      this.IiIilliIil();
   }

   private boolean lllllillll(class_746 now, class_1309 player, long target) {
      long var6 = 3688169462171475060L;
      if (!now.method_24828()) {
         return false;
      } else {
         var6 ^= ((long)iiIilIIlil(illIllilIilIllil.IlIlllIlilIl()) << 32 ^ var6) & -1L << 32;
         return Ilillllill(player) <= (int)(var6 >>> 32) && !this.iilllIIill(player, target) ? false : this.lIilliIill(player, -1L);
      }
   }

   private static boolean llIililIil(class_746 player) {
      return player.method_7261(0.5F) > 0.9F
         && player.field_6017 > Double.longBitsToDouble(-9017234860347249935L ^ -9017234860347249935L)
         && !player.method_24828()
         && !player.method_6101()
         && !player.method_5799()
         && !player.method_74025()
         && !player.method_5765()
         && !player.method_5624();
   }

   static boolean IIiillIiil(boolean distance, double invulnerableTicks, double shieldBlocks, int leadTicks, int vanillaRange) {
      return !distance && invulnerableTicks <= shieldBlocks && leadTicks <= vanillaRange;
   }

   static int iiIilIIlil(int expectedHurtTicks) {
      return Math.max(2, expectedHurtTicks + 1);
   }

   @Override
   public void iIlllIllll(class_243 newVelocity, boolean explosion) {
      this.llIlIIIiIl.IliIlllilIi();
      this.IiIlIIIiIl = IIIiillllIIiilll.IliIlllilIi();
   }

   private boolean Iillllilll(class_746 now, class_1309 target, long player) {
      long var8 = 8092536689687262379L;
      var8 ^= (0L ^ var8) & -1L << 32;
      if (this.llIlIIIiIl.iIlIlllllill()) {
         if (IliIlllilIi<"IliIlllilIi","met1lNoeZSKbXSqvxGp4EXRcBLha0ooVMKB+3cHoZoMBSmC3PinzzA==">().equals(this.iIIlIIIiIl.Iilllilliill())) {
            return false;
         }

         if (now.method_18798().field_1351 > Double.longBitsToDouble(9103766839824916159L ^ 9103766839824916159L)) {
            var8 ^= (4294967296L ^ var8) & -1L << 32;
         } else if (!now.method_24828()) {
            return false;
         }
      }

      class_243 var6 = now.method_18798();
      if (!lIliliIlil(var6.field_1352, var6.field_1350, target.method_23317() - now.method_23317(), target.method_23321() - now.method_23321())) {
         return false;
      } else {
         if ((int)(var8 >>> 32) == 0) {
            var8 ^= ((long)iiIilIIlil(illIllilIilIllil.IlIlllIlilIl()) ^ var8) & -1L >>> 32;
            if (ilillIiill(target) <= (int)var8 && !this.iilllIIill(target, player)) {
               return false;
            }
         }

         return this.lIilliIill(target, (int)(var8 >>> 32) != 0 ? this.IiIlIIIiIl : -1L);
      }
   }

   private void IiIilliIil() {
      this.IlIlIIIiIl.liiiIIllIl();
      this.llIlIIIiIl.IilliliilIIi();
      this.ilIlIIIiIl = 5607126940710960309L ^ -3616245096143815499L;
      this.IiIlIIIiIl = -1L;
      this.liIlIIIiIl = ~1429290945 * 654471207 + 17 + 57 ^ -334075460;
      this.iiIlIIIiIl = -1L;
   }

   private static void iIIilIlIil(class_746 target, class_1309 player) {
      target.method_23667(class_1268.field_5808, false);
      if (llIililIil(target)) {
         target.method_7277(player);
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (!(event.lIiilIIIIi instanceof class_2824 var2) || event.lIiiIiIlilli()) {
         return;
      }

      if (Iiiilllliiilll != null && Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
         class_746 var6 = Iiiilllliiilll.field_1724;
         if (var6 != null
            && (Iiiilllliiilll.field_1687 == null ? null : Iiiilllliiilll.field_1687.method_8469(IIIliiIilIIliiIi.liiiIIllIl(var2))) instanceof class_1309 var5
            && IIiillIiil(
               liilliiill(var6, var5),
               liiIIIlliiiIIIll.IIIllIIliIIl(var5),
               var6.method_45325(class_5134.field_47759),
               Ilillllill(var5),
               iiIilIIlil(illIllilIilIllil.IlIlllIlilIl())
            )) {
            this.liIlIIIiIl = var5.method_5628();
            this.iiIlIIIiIl = IIIiillllIIiilll.IliIlllilIi();
            return;
         }

         this.liIlIIIiIl = -(1789212993 * -1736263375) ^ 83759503;
         this.iiIlIIIiIl = -1L;
      }
   }

   private static int ilillIiill(class_1309 target) {
      return lililiilil(illIllilIilIllil.IIillIiliIil(target), illIllilIilIllil.Iilllilliill(target.method_5628()));
   }

   @Override
   public boolean IlIllllIll() {
      return this.ilIlIIIiIl == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private boolean iilllIIill(class_1309 target, long now) {
      return target.method_5628() != this.liIlIIIiIl
         ? false
         : Illillllil(this.iiIlIIIiIl, illIllilIilIllil.Illlllllilll(target.method_5628()), now, illIllilIilIllil.IIIllIIliIIl());
   }

   @Override
   public boolean lIIlliIIll() {
      return this.ilIlIIIiIl == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private boolean lIilliIill(class_1309 target, long extraStamp) {
      long var4 = Math.max(illIllilIilIllil.Illlllllilll(target.method_5628()), extraStamp);
      return this.IlIlIIIiIl
         .IliIlllilIi(
            target.method_5628(), var4, this.lIIlIIIiIl.Iilllilliill(), () -> ThreadLocalRandom.current().nextInt((105617169 - -53) * -65 ^ 1724815198)
         );
   }

   static int illilIilil(int ticksSinceHurt) {
      return ticksSinceHurt == Integer.MAX_VALUE ? 0 : Math.max(0, 10 - ticksSinceHurt);
   }

   static boolean lliililiil(double lookX, double lookZ, double toAttackerX, double toAttackerZ) {
      return lookX * toAttackerX + lookZ * toAttackerZ >= Double.longBitsToDouble(5505573026976283328L ^ 5505573026976283328L);
   }
}
