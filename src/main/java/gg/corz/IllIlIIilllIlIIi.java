package gg.corz;

import com.corz.client.mixins.AccessorRepeatingAudioStream;
import com.corz.client.mixins.AccessorSoundManager;
import com.corz.client.mixins.AccessorSoundSystem;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.minecraft.class_1140;
import net.minecraft.class_1144;
import net.minecraft.class_156;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3419;
import net.minecraft.class_4224;
import net.minecraft.class_4234;
import net.minecraft.class_437;
import net.minecraft.class_4856;
import net.minecraft.class_9673;
import net.minecraft.class_1140.class_11518;
import net.minecraft.class_4235.class_4236;

public final class IllIlIIilllIlIIi {
   private static final float illillliil = 0.1F;
   private static long lIlIilliil;
   private static long iIlIilliil;
   private static final Consumer<class_4224> Iliillliil = s -> s.method_19647(IllIlIIilllIlIIi.liiillliil);
   private static long liIIilliil;
   private static volatile boolean iiiillliil;
   private static long IIlIilliil;
   private static volatile float liiillliil;
   private static IliIIIilliIIIi iIIIilliil;
   static final int iIlillliil = 44100;
   private static final Consumer<class_4224> iliillliil = class_4224::method_19654;
   private static volatile IliIIIilliIIIi IIIIilliil;
   private static long iiIIilliil;
   private static float IlIIilliil;
   private static boolean IllIilliil;
   private static final float Iilillliil = 1.0E-4F;
   private static final Consumer<class_4224> Iiiillliil = s -> {
      if (s.method_35598()) {
         iiiillliil = true;
      }
   };
   private static final long iIiillliil = 10000000000L;
   private static boolean llIIilliil;
   private static final long lilillliil = 8000000L;
   private static final long lIiillliil = 3000000000L;
   static final float Illillliil = 1.8F;
   static final float lllillliil = 1.1F;
   private static final long iilillliil = 30000000L;
   private static float ilIIilliil = -1.0F;
   private static final long IIiillliil = 10000000L;
   private static final Consumer<class_4224> lliillliil = class_4224::method_19653;
   private static float IiIIilliil = 1.0F;
   private static final long[] lIIIilliil = new long[IiIIlIiliIIlIi.values().length];

   static long IlIlllIlilIl(long loopFrames, long playedNs, long startFrame) {
      long var6 = Math.max(0L, playedNs);
      long var8 = var6 / 1000000000L * 44100L + var6 % 1000000000L * 44100L / 1000000000L;
      return Math.floorMod(Math.floorMod(loopFrames, startFrame) + Math.floorMod(var8, startFrame), startFrame);
   }

   private static void IiIiliIiiiIi(long now) {
      long var5 = 9036027857652507149L;
      float var2 = Illlllllilll();
      var5 ^= ((long)(!(IlIIilliil <= 0.0F) && !(IlIIilliil >= 1.0F) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if (!(Math.abs(var2 - ilIIilliil) < 1.0E-4F)) {
         if ((int)(var5 >>> 32) != 0 || now - iiIIilliil >= 8000000L) {
            class_4236 var4 = Illillliilli();
            if (var4 != null) {
               liiillliil = ((AccessorSoundSystem)Iilililiiili()).corzAdjustedVolume(iIIIilliil);
               var4.method_19735(Iliillliil);
               ilIIilliil = var2;
               iiIIilliil = now;
            }
         }
      }
   }

   static boolean IlIillIiilIi(class_310 mc) {
      long var4 = 8993080027903451003L;
      if (!illilIiIililIi.IliIlllilIi()) {
         return false;
      } else {
         class_437 var1 = mc.field_1755;

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 4 && var1 != null; var6 += 4294967296L) {
            if (var1 instanceof lillliiliillliil) {
               return (int)(var6 >>> 32) > 0 || !lillliiliillliil.liIlliiIll();
            }

            var1 = var1 instanceof Iliilliiilii var3 ? var3.IllIllllIl() : null;
         }

         return false;
      }
   }

   static IiIIlIiliIIlIi IIillIiliIil(iIiiilIiIliiilIi season) {
      return switch (season) {
         case lIIIIilIIi -> IiIIlIiliIIlIi.iiIliIIiiIIlliIIii;
         case iIIIIilIIi -> IiIIlIiliIIlIi.lIlliIIiiiIlliIIii;
         case IIIIIilIIi -> null;
      };
   }

   static float Illlllllilll() {
      float var0 = Iilllilliill(IlIIilliil);
      return var0 * var0 * Iiilliiliiil();
   }

   public static float IIlllIlliIll() {
      return iIIIilliil != null && !llIIilliil ? 1.0F - Iilllilliill(IlIIilliil) : 1.0F;
   }

   private static class_4236 Illillliilli() {
      class_1140 var0 = Iilililiiili();
      return var0 != null && iIIIilliil != null ? ((AccessorSoundSystem)var0).corzSources().get(iIIIilliil) : null;
   }

   private static void iIlIlllllill(class_1144 now, long sounds) {
      long var5 = -5316693510685380181L;
      float var3 = IIlllIlliIll();
      if (var3 != IiIIilliil) {
         var5 ^= ((long)(!(var3 >= 1.0F) && !(var3 <= 0.0F) ? 0 : 1) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) != 0 || !(Math.abs(var3 - IiIIilliil) < 0.01F) && sounds - IIlIilliil >= 30000000L) {
            now.method_76569(class_3419.field_15253);
            IiIIilliil = var3;
            IIlIilliil = sounds;
         }
      }
   }

   private static IiIIlIiliIIlIi Ililllililil() {
      long var3 = -7377281309049315181L;
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      if (var0 != null && var0.llIillllil.Iilllilliill() && !(Iiilliiliiil() <= 0.0F)) {
         iIiiilIiIliiilIi var1 = iIiiilIiIliiilIi.IliIlllilIi();

         var3 ^= ((long)(switch (var1) {
            case lIIIIilIIi -> lIliIllliIliIlll.liiiIIllIl();
            case iIIIIilIIi -> iilIIiIIiIIi.liiiIIllIl();
            case IIIIIilIIi -> 0;
         }) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) != 0 ? IIillIiliIil(var1) : null;
      } else {
         return null;
      }
   }

   private static void liiiIIllIl() {
      class_310 var0 = class_310.method_1551();
      if (var0 != null) {
         class_1144 var1 = var0.method_1483();
         if (var1 != null) {
            long var2 = System.nanoTime();
            if (IIiIIllIiIIl.IliIlllilIi()) {
               if (iIIIilliil != null) {
                  var1.method_4870(iIIIilliil);
                  IIiilIiiiIii();
               }

               iIlIlllllill(var1, var2);
            } else {
               long var4 = liIIilliil == 0L ? 0L : var2 - liIIilliil;
               float var6 = Math.min(0.1F, (float)var4 / 1.0E9F);
               liIIilliil = var2;
               IilliliilIIi(var0, var1, var2, var6, var4);
               iIlIlllllill(var1, var2);
            }
         }
      }
   }

   private static void IIlilIliiIli(Consumer<class_4224> action) {
      class_4236 var1 = Illillliilli();
      if (var1 != null) {
         var1.method_19735(action);
      }
   }

   private static float Iiilliiliiil() {
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      if (var0 == null) {
         return 0.0F;
      } else {
         double var1 = var0.ilIillllil.Iilllilliill();
         return (float)(var1 < 0.0 ? 0.0 : (var1 > 1.0 ? 1.0 : var1));
      }
   }

   static float Iilllilliill(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      return t * t * (3.0F - 2.0F * t);
   }

   public static void IiIlliIliiIl() {
      if (iIIIilliil != null && llIIilliil) {
         IIlilIliiIli(lliillliil);
      }
   }

   private static boolean lIiiIiIlilli(long now) {
      if (!iIIIilliil.iIIIiIiliIlIIiIili) {
         return false;
      } else if (iiiillliil) {
         return true;
      } else {
         if (now - lIlIilliil >= 10000000L) {
            lIlIilliil = now;
            IIlilIliiIli(Iiiillliil);
         }

         return false;
      }
   }

   private static void IilliliilIIi(class_310 dns, class_1144 now, long sounds, float mc, long dt) {
      long var12 = -3557633815588451123L;
      IiIIlIiliIIlIi var7 = Ililllililil();
      var12 ^= ((long)(var7 != null && IlIillIiilIi(dns) && IIIilIIiiIIi(dns) ? 1 : 0) << 32 ^ var12) & -1L << 32;
      if (iIIIilliil != null && iIIIilliil.IiIIiIililiIIiIili && !llIIilliil) {
         iIIIilliil.iiIIiIiliIIlIiIili += dt;
      }

      if (iIIIilliil != null && !now.method_4877(iIIIilliil)) {
         IIiilIiiiIii();
      }

      if (iIIIilliil != null && iIIIilliil.IliilIililliilIili != var7) {
         var12 ^= (0L ^ var12) & -1L << 32;
      }

      if (iIIIilliil == null) {
         IlIIilliil = 0.0F;
         if ((int)(var12 >>> 32) == 0 || sounds < iIlIilliil) {
            return;
         }

         IliIIIilliIIIi var9 = new IliIIIilliIIIi(var7, lIIIilliil[var7.ordinal()], sounds);
         iiiillliil = false;
         IIIIilliil = var9;

         class_11518 var10;
         try {
            var10 = now.method_4873(var9);
         } finally {
            IIIIilliil = null;
         }

         if (var10 == class_11518.field_60956 || !now.method_4877(var9)) {
            iIlIilliil = sounds + 3000000000L;
            return;
         }

         if (!var9.llIIiIiliilIIiIili) {
            var9.IIIIiIililIIIiIili = 0L;
            var9.iIIIiIiliIlIIiIili = true;
         }

         iIIIilliil = var9;
         llIIilliil = false;
         ilIIilliil = -1.0F;
      }

      if (!iIIIilliil.IiIIiIililiIIiIili) {
         if (iIIIilliil.IliilIililliilIili != var7) {
            now.method_4870(iIIIilliil);
            IIiilIiiiIii();
            return;
         }

         if (!lIiiIiIlilli(sounds)) {
            if (sounds - iIIIilliil.liiilIiliiiiilIili > 10000000000L) {
               now.method_4870(iIIIilliil);
               IIiilIiiiIii();
               iIlIilliil = sounds + 3000000000L;
            }

            return;
         }

         iIIIilliil.IiIIiIililiIIiIili = true;
      }

      if ((int)(var12 >>> 32) != 0) {
         if (llIIilliil) {
            IIlilIliiIli(iliillliil);
            llIIilliil = false;
         }

         IlIIilliil = Math.min(1.0F, IlIIilliil + mc / 1.8F);
      } else {
         IlIIilliil = Math.max(0.0F, IlIIilliil - mc / 1.1F);
      }

      IiIiliIiiiIi(sounds);
      if ((int)(var12 >>> 32) == 0 && IlIIilliil <= 0.0F) {
         if (iIIIilliil.IliilIililliilIili != var7) {
            now.method_4870(iIIIilliil);
            IIiilIiiiIii();
         } else if (!llIIilliil) {
            IIlilIliiIli(lliillliil);
            llIIilliil = true;
         }
      }
   }

   public static void IliIlllilIi() {
      if (!IllIilliil) {
         try {
            liiiIIllIl();
         } catch (Throwable var3) {
            IllIilliil = true;

            try {
               class_310 var1 = class_310.method_1551();
               if (iIIIilliil != null && var1 != null && var1.method_1483() != null) {
                  var1.method_1483().method_4870(iIIIilliil);
               }
            } catch (Throwable var2) {
            }

            iIIIilliil = null;
         }
      }
   }

   private IllIlIIilllIlIIi() {
   }

   private static boolean IIIilIIiiIIi(class_310 mc) {
      return mc.field_1690 != null && mc.field_1690.method_71978(class_3419.field_61058) > 0.0F;
   }

   private static void IIiilIiiiIii() {
      if (iIIIilliil != null) {
         lIIIilliil[iIIIilliil.IliilIililliilIili.ordinal()] = iIIIilliil.IliIlllilIi();
      }

      iIIIilliil = null;
      llIIilliil = false;
      IlIIilliil = 0.0F;
      ilIIilliil = -1.0F;
   }

   private static class_1140 Iilililiiili() {
      class_310 var0 = class_310.method_1551();
      class_1144 var1 = var0 == null ? null : var0.method_1483();
      return var1 == null ? null : ((AccessorSoundManager)var1).corzSoundSystem();
   }

   public static CompletableFuture<class_4234> iliIiiliiiii(class_2960 loading, CompletableFuture<class_4234> id) {
      IliIIIilliIIIi var2 = IIIIilliil;
      if (var2 != null && !var2.llIIiIiliilIIiIili && id != null && var2.method_4776() != null && var2.method_4776().method_4766().equals(loading)) {
         var2.llIIiIiliilIIiIili = true;
         return id.thenApplyAsync(stream -> {
            try {
               var2.IIIIiIililIIIiIili = IIIllIIliIIl(stream, var2.iliilIiliIiiilIili);
            } catch (RuntimeException | IOException var3) {
            }

            var2.iIIIiIiliIlIIiIili = true;
            return (class_4234)stream;
         }, class_156.method_55473());
      } else {
         return null;
      }
   }

   static long IIIllIIliIIl(class_4234 frames, long stream) {
      long var9 = -8530359024349848898L;
      if (stream <= 0L) {
         return 0L;
      } else if (!((frames instanceof class_4856 var4 ? ((AccessorRepeatingAudioStream)var4).corzDelegate() : frames) instanceof class_9673 var11)) {
         return 0L;
      } else {
         var9 ^= ((long)Math.max(1, var11.method_19719().getChannels()) << 32 ^ var9) & -1L << 32;
         long var6 = stream * (long)((int)(var9 >>> 32));
         illllIilIilllIil var8 = new illllIilIilllIil();

         while (var8.iIlIiIlIil < var6 && var11.method_59758(var8)) {
         }

         return var8.iIlIiIlIil / (long)((int)(var9 >>> 32));
      }
   }
}
