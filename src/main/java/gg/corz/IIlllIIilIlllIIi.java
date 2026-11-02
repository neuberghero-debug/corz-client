package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntToDoubleFunction;
import net.minecraft.class_10439;
import net.minecraft.class_1092;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import net.minecraft.class_9334;
import org.lwjgl.glfw.GLFW;

public class IIlllIIilIlllIIi extends ilIllIiIll {
   private long IiIIiiliil;
   private final lliliIIiililiIIi ilIililiil;
   private static final List<String> iilIiiliil = lliliilili();
   private final iiIiiilIIliiil lIlililiil;
   private float IlIIiiliil;
   private final illlIlIlIillIlIl liIililiil;
   private final iilliIlIIiliIl iIlililiil;
   private long iiiililiil;
   private final IlIlIIilllIlIIil lIIIiiliil;
   private long liIIiiliil;
   private String llIIiiliil;
   private static final class_2960 iIIililiil = class_2960.method_60655(
      IliIlllilIi<"IliIlllilIi","fMywn64ZRRaLhC/lutF5kYzueQlUEWg96ifkJ6rMAbbRJVqL/QI=">(),
      IliIlllilIi<"IliIlllilIi","gI+K+ldSuxXxNVMeClxIS9DoTyGgFgEesDwiiMaLLgiM36J9ayGW359A1q+6juA=">()
   );
   private long Iilililiil;
   static final iiiiiIlIIIIIll illIiiliil = new iiiiiIlIIIIIll(900, 2, 0.38F, 0.2F, -0.02F, -20.0F, 12.0F, -6.0F, 28.0F, 44.0F, 34.0F, 20.0F, 74.0F);
   private long IIIIiiliil;
   private List<iIIIIIliIlIIIIli> Iiiililiil;
   private final IlIlIIilllIlIIil IllIiiliil;
   private String iliililiil;
   private final IIIIlilllIIIlill lllililiil;
   private int lilililiil;
   private final iiIiiilIIliiil IIlililiil;
   private static final String[] IlIililiil = lIIlliIIll();
   private final lliliIIiililiIIi IiIililiil;
   private static final String[] IIIililiil = new String[]{
      IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">(),
      IliIlllilIi<"IliIlllilIi","ujX8xr/WOWxV7YbW/VB8iUuORi+J/T2f/RiYBDulyMM=">(),
      IliIlllilIi<"IliIlllilIi","KXd+wd2GQriP7jpd1roSmb172zcGYwSp417OsEzDCes=">(),
      IliIlllilIi<"IliIlllilIi","0hb2kbbV6wEGAxVSwHOQP4Kvoylfr7pAkF0NWp+c/DM7yuiGWAu6">(),
      IliIlllilIi<"IliIlllilIi","oZTVOS9srjER6DPYQaBDL4FiHHC8g7KUmnZCu7exHb8x">(),
      IliIlllilIi<"IliIlllilIi","JL1B1+yiQRjQfywXwefPeCYwVd1Ikg4di1wwmD034P8=">(),
      IliIlllilIi<"IliIlllilIi","KDycO9az/eJM8Qv6TgnS7E2NgWeo7hvCUwJKcQ3/TuErZILBsA==">(),
      IliIlllilIi<"IliIlllilIi","mIpVZMbjDCRqMPldHIqqe6YvsKpqL2MPVLHIz/n5Lwkswqo53Mc=">(),
      IliIlllilIi<"IliIlllilIi","sk55ijK12Kcw8YhMXagTkaQGePnmHMK63k5x+9glweAga3LG">()
   };
   private long iIiililiil;
   private iiiiiIlIIIIIll lIiililiil;
   private static final Map<String, class_2960> lIIililiil = new HashMap<>();
   private boolean IIlIiiliil;
   private final lililiiiililii iIIIiiliil;
   private final iiIiiilIIliiil iiIililiil;
   private List<iIiiiilIliiiil> lIlIiiliil;
   private final lliliIIiililiIIi llIililiil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","U45XVHmJON6KH1yquUGlk5WyMqZHas4nNKIoIbcrcE47fM2aZQ==">(),
      IliIlllilIi<"IliIlllilIi","jixhUpif5Z/it/k6nUhrqwd4k2HlhQ7IUME5vQm0YJbaNt2itXXP8VLeH/pcI0utpQO5QBVyD83zCT8TX3lhUhbDUVaqf0z9nwYHZ3FkYV89t3ye/apzSQEbpPLo">(),
      IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">(),
      IIIililiil
   );
   private static final Map<String, iiiiiIlIIIIIll> IilIiiliil = Map.of(
      IliIlllilIi<"IliIlllilIi","KXd+wd2GQriP7jpd1roSmb172zcGYwSp417OsEzDCes=">(),
      new iiiiiIlIIIIIll(2450, 5, 0.1F, 0.0F, -0.37F, -25.0F, 34.0F, -6.0F, 28.0F, 44.0F, 26.0F, 20.0F, 74.0F),
      IliIlllilIi<"IliIlllilIi","JL1B1+yiQRjQfywXwefPeCYwVd1Ikg4di1wwmD034P8=">(),
      new iiiiiIlIIIIIll(1750, 5, 0.18F, 0.1F, -0.33F, -33.0F, 32.0F, -31.0F, 69.0F, 75.0F, 5.0F, 20.0F, 60.0F),
      IliIlllilIi<"IliIlllilIi","KDycO9az/eJM8Qv6TgnS7E2NgWeo7hvCUwJKcQ3/TuErZILBsA==">(),
      new iiiiiIlIIIIIll(3800, 1, 0.12F, 0.06F, -0.3F, -22.0F, 28.0F, -6.0F, 24.0F, 14.0F, 30.0F, 14.0F, 86.0F),
      IliIlllilIi<"IliIlllilIi","mIpVZMbjDCRqMPldHIqqe6YvsKpqL2MPVLHIz/n5Lwkswqo53Mc=">(),
      new iiiiiIlIIIIIll(3400, 1, 0.1F, 0.06F, -0.3F, -24.0F, 30.0F, -6.0F, 22.0F, 16.0F, 28.0F, 18.0F, 84.0F),
      IliIlllilIi<"IliIlllilIi","sk55ijK12Kcw8YhMXagTkaQGePnmHMK63k5x+9glweAga3LG">(),
      new iiiiiIlIIIIIll(3200, 2, 0.1F, 0.06F, -0.3F, -24.0F, 30.0F, -6.0F, 26.0F, 18.0F, 30.0F, 14.0F, 86.0F)
   );
   private float[] liiililiil;
   private final ililliIiIiilliIi illililiil;
   private final lililiiiililii lllIiiliil;
   private final lliliIIiililiIIi Illililiil;
   private int IIiililiil;
   private static final String lilIiiliil = "Butterfly";
   private static final long iiIIiiliil = 400L;
   private iliiiIiiii Iliililiil;
   private int ilIIiiliil;
   private int iilililiil;
   private float[] iIlIiiliil;

   public static iliiiIiiii IIililIili(String knife) {
      if (!iliiiIiiii.lIiiIiIlilli(knife)) {
         return null;
      } else {
         iiiiiIlIIIIIll var1 = iIlIiIllIi(knife);
         return iliiiIiiii.IIIllIIliIIl(knife, var1.IiIlliIliiIl(), var1.IIlllIlliIll(), var1.liiiIIllIl());
      }
   }

   private void iiiilIIIIi(class_1309 entity, class_1268 hand) {
      if (this.IIlIiiliil && iIiIiliIliIili.IIIIllIIIl(entity, hand)) {
         IIiiIIlilIiiIIli.lIiiIiIlilli(this.IIIIiiliil);
         this.IIIIiiliil = 0L;
         long var3 = iIlllIllll();
         if (var3 - this.liIIiiliil >= (-9077929915101141662L ^ -9077929915101141938L)) {
            this.liIIiiliil = var3;
            this.Illillllil(IliIlllilIi<"IliIlllilIi","VcM70A9sVaYHs3S6kxgd2eTMY2PEfpRpI0F6LnMHVbin">(), 0.26F, 1.0F);
         }
      }
   }

   static float IIIlilIIli(float a, iiiiiIlIIIIIll p) {
      float var2 = p.Iilllilliill() / 100.0F;
      float var3 = p.IIillIiliIil() / 100.0F;
      float var4 = IliIilliIi(lIiiiiIiii(a / var2));
      float var5 = IliIilliIi(lIiiiiIiii((1.0F - a) / (1.0F - var3)));
      return Math.min(var4, var5);
   }

   private void IIllllIlll() {
      long var2 = 7523586860433648021L;
      var2 ^= ((long)this.IliIlllilIi() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.IIlIiiliil) {
         this.IIlIiiliil = (boolean)((int)(var2 >>> 32));
         iIiIiliIliIili.IliIlllilIi((boolean)((int)(var2 >>> 32)));
      }
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      long var4 = -7613655709126237964L;
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         var4 ^= (
               (long)(
                        var2.has(IliIlllilIi<"IliIlllilIi","QNI7qUTk5+kNPlMGQDxc/QG6pI7v3ODQe9oXv6i8DEBqzeFnQTfGXw==">())
                              && var2.get(IliIlllilIi<"IliIlllilIi","QNI7qUTk5+kNPlMGQDxc/QG6pI7v3ODQe9oXv6i8DEBqzeFnQTfGXw==">()).isJsonPrimitive()
                              && var2.get(IliIlllilIi<"IliIlllilIi","QNI7qUTk5+kNPlMGQDxc/QG6pI7v3ODQe9oXv6i8DEBqzeFnQTfGXw==">())
                                 .getAsJsonPrimitive()
                                 .isNumber()
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var4
            )
            & -1L << 32;
         this.lllililiil
            .IIillIiliIil(
               iilliliIIilili.iIlIlllllill(
                  (int)(var4 >>> 32) != 0 ? var2.get(IliIlllilIi<"IliIlllilIi","QNI7qUTk5+kNPlMGQDxc/QG6pI7v3ODQe9oXv6i8DEBqzeFnQTfGXw==">()).getAsInt() : 0,
                  this.lllililiil.Iilllilliill()
               )
            );
         if (var2.has(IliIlllilIi<"IliIlllilIi","soEU96Tolc9jRUosJvk0Q7dvkeG/110AboNISorOTYw0nt+9gQ==">())
            && var2.get(IliIlllilIi<"IliIlllilIi","soEU96Tolc9jRUosJvk0Q7dvkeG/110AboNISorOTYw0nt+9gQ==">()).isJsonPrimitive()
            && illIIlllIilIIlll.IIIllIIliIIl(var2.get(IliIlllilIi<"IliIlllilIi","soEU96Tolc9jRUosJvk0Q7dvkeG/110AboNISorOTYw0nt+9gQ==">()).getAsString())
               != null) {
            this.iliililiil = var2.get(IliIlllilIi<"IliIlllilIi","soEU96Tolc9jRUosJvk0Q7dvkeG/110AboNISorOTYw0nt+9gQ==">()).getAsString();
         }
      }
   }

   private boolean lllllillll() {
      long var2 = -9219203141453448673L;
      var2 ^= ((long)this.liIililiil.Ililllililil() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < 0 || Iiiilllliiilll.method_22683() == null) {
         return false;
      } else {
         return IlIiliIlllIiliIl.IliIlllilIi((int)(var2 >>> 32))
            ? GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), IlIiliIlllIiliIl.liiiIIllIl((int)(var2 >>> 32)))
               == ((--1582012287 >>> 23 | --1582012287 << 9) + -43 ^ -1758527856)
            : class_3675.method_15987(Iiiilllliiilll.method_22683(), (int)(var2 >>> 32));
      }
   }

   @Override
   protected void lilIliilIl(IiiIlllliiIlll e) {
      if (this.IliIlllilIi() && e.liiiIIllIl() == (943553316 * 1090785345 ^ -97 ^ -803112006)) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
            if (this.liIililiil.IiIiliIiiiIi(e.IliIlllilIi())) {
               if (this.Iliililiil == null || !this.lllIiillIi()) {
                  if (!this.IIlIiiliil || !iIiIiliIliIili.Ililllililil()) {
                     this.Iillllilll();
                  }
               }
            }
         }
      }
   }

   public void IiIliliIli(class_4587 arm, int m, class_1306 side) {
      float var4 = this.iilIiIIiIi();
      float var5 = this.liiIiiiiIi(var4);
      float var6 = this.lIiililiil.Illlllllilll() / 34.0F;
      float var7 = (
            (float)(-m) * 16.0F * iliIiIiiIi(var4, 0.0F, 0.24F)
               + (float)m * 34.0F * iliIiIiiIi(var4, 0.12F, 0.6F)
               - (float)m * 14.0F * iliIiIiiIi(var4, 0.6F, 1.0F)
         )
         * var6;
      float var8 = (-9.0F * iliIiIiiIi(var4, 0.0F, 0.32F) + 7.0F * iliIiIiiIi(var4, 0.3F, 1.0F)) * var6;
      float var9 = (float)m * 0.56F;
      float var10 = -0.52F;
      float var11 = -0.72F;
      arm.method_46416(var9, var10, var11);
      arm.method_22907(class_7833.field_40718.rotationDegrees(var7 * var5));
      arm.method_22907(class_7833.field_40714.rotationDegrees(var8 * var5));
      arm.method_46416(-var9, -var10, -var11);
   }

   public String lIIiiiIIii() {
      return this.ilIililiil.Iilllilliill();
   }

   private static boolean iiliiIIiii(class_1799 s) {
      return s.method_57353().method_57832(class_9334.field_55878);
   }

   @Override
   protected void Iilililiiili() {
      this.IIllllIlll();
      this.IllIiiliil.iliIiiliiiii(this.lllIiiliil);
      this.lIIIiiliil.iliIiiliiiii(this.iIIIiiliil);
   }

   public class_1799 liIIiiiIIi(class_1799 part, illIIlllIilIIlll stack, int rig) {
      class_1799 var4 = part.method_7972();
      var4.method_57379(
         class_9334.field_54199,
         lIIililiil.computeIfAbsent(
            stack.IiIlliIliiIl(rig).IliIlllilIi(),
            n -> class_2960.method_60655(IliIlllilIi<"IliIlllilIi","fMywn64ZRRaLhC/lutF5kYzueQlUEWg96ifkJ6rMAbbRJVqL/QI=">(), n)
         )
      );
      return var4;
   }

   public boolean IIiillIiil(class_742 hand, class_1268 player, class_1799 stack) {
      return this.IIlIiiliil && iIiIiliIliIili.IIiilIiiiIii(hand, player, stack);
   }

   public boolean lllIiillIi() {
      if (this.Iilililiil < (6355027344020430291L ^ 6355027344020430291L)) {
         return false;
      } else {
         long var1 = iIlllIllll() - this.Iilililiil;
         if (var1 >= (288532077388619030L ^ 288532077388619030L) && var1 < (long)this.iilililiil) {
            return true;
         } else {
            this.Iilililiil = -1L;
            return false;
         }
      }
   }

   private static long iIlllIllll() {
      return System.nanoTime() / (-3109246978522865643L ^ -3109246978521865643L);
   }

   @Override
   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IliIlllilIi<"IliIlllilIi","QNI7qUTk5+kNPlMGQDxc/QG6pI7v3ODQe9oXv6i8DEBqzeFnQTfGXw==">(), 4);
      if (this.iliililiil != null) {
         var1.addProperty(IliIlllilIi<"IliIlllilIi","soEU96Tolc9jRUosJvk0Q7dvkeG/110AboNISorOTYw0nt+9gQ==">(), this.iliililiil);
      }

      return var1;
   }

   public boolean IlIiillIii() {
      return !IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">().equals(this.ilIililiil.Iilllilliill());
   }

   static float[] iilllIIill(List<iIIIIIliIlIIIIli> cues, float seconds) {
      float[] var2 = new float[cues.size()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = ((iIIIIIliIlIIIIli)cues.get(var3)).IliIlllilIi() * seconds;
      }

      return var2;
   }

   private illIIlllIilIIlll lIIIiiIIIi(class_1309 stack, class_1799 entity) {
      if (Iiiilllliiilll.field_1724 != null && stack == Iiiilllliiilll.field_1724 && this.IIIillIIil(entity)) {
         iliiiIiiii var3 = this.Iliililiil;
         return var3 != null && this.lllIiillIi()
            ? illIIlllIilIIlll.IIIllIIliIIl(IIIililiil[this.lilililiil])
            : illIIlllIilIIlll.IIIllIIliIIl(this.iIIilIlIil(null));
      } else {
         return null;
      }
   }

   public String IIliilIlii() {
      return this.IiIililiil.Iilllilliill();
   }

   public String iiiliIIIii() {
      return this.llIililiil.Iilllilliill();
   }

   static float iliIiIiiIi(float a, float b, float t) {
      return !(a <= b) && !(a >= t)
         ? (float)Math.sin(Double.longBitsToDouble(-4357096864924601797L ^ -8970789446098657501L) * (double)((a - b) / (t - b)))
         : 0.0F;
   }

   public void lIlliiIlli(class_4587 m, int side, class_1306 arm) {
      Illlilllli(m, IIIililiil[this.lilililiil], this.iilIiIIiIi(), this.IIiililiil, this.lIiililiil);
   }

   private iiIiliiIIlilii IlIllllIll(class_1309 stack, class_1799 entity) {
      if (Iiiilllliiilll.field_1724 != null && stack == Iiiilllliiilll.field_1724 && this.IIIillIIil(entity)) {
         iiIiliiIIlilii var3 = iiIiliiIIlilii.IIillIiliIil(this.ilIililiil.Iilllilliill());
         if (var3 != null) {
            return var3;
         } else {
            return this.lIIIiiIIIi(stack, entity) == illIIlllIilIIlll.liIIIIIill ? iiIiliiIIlilii.lIIllliIIl : null;
         }
      } else {
         return null;
      }
   }

   private void liIlliiIll() {
      class_310 var1 = class_310.method_1551();
      var1.method_1507(new ilillllIiillll(var1.field_1755, this));
   }

   static float IliIilliIi(float x) {
      return 1.0F - (float)Math.pow((double)(1.0F - x), Double.longBitsToDouble(5288405821271917320L ^ 678971602658214664L));
   }

   @Override
   protected void iIIIlIlIIl() {
      this.IIllllIlll();
      if (this.IIlIiiliil) {
         iIiIiliIliIili.Iilllilliill(this.iiIililiil.Iilllilliill() && Iiiilllliiilll.field_1755 == null && this.lllllillll());
      }

      this.liilliiill();
      this.ilillIiill();
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
         this.lililiilil();
         if (!Iiiilllliiilll.method_1493()) {
            long var1 = iIlllIllll();
            boolean var3 = Iiiilllliiilll.field_1724.field_6252 || Iiiilllliiilll.field_1724.method_6115() || this.IIlIiiliil && iIiIiliIliIili.Ililllililil();
            if (var3 && this.lllIiillIi()) {
               this.Iilililiil = -1L;
               this.iIiililiil = var1;
            } else if (this.iiIililiil.Iilllilliill() && !var3 && !this.lllIiillIi() && this.lllllillll()) {
               this.Iillllilll();
            } else if (this.lIlililiil.Iilllilliill()) {
               if (!this.lllIiillIi() && !var3 && !(Iiiilllliiilll.field_1724.method_18798().method_37268() > 1.0E-4)) {
                  if (var1 - this.iIiililiil >= (long)this.iIlililiil.Iilllilliill() * 1000L) {
                     this.Iillllilll();
                  }
               } else {
                  this.iIiililiil = var1;
               }
            }
         }
      }
   }

   public IIlllIIilIlllIIi() {
      super(IliIlllilIi<"IliIlllilIi","zdvBZc78ltP8q/ne5z2B2tsqyJc/VkqbVsINxMIqKo426ftxFQw745o=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.ilIililiil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","Ak7INoAFGnjUQiCNNwcQJQkexOdQyFjvgy/rnmiAazDhjHfZnaKU">(),
         IliIlllilIi<"IliIlllilIi","ojbVbMwRSlnounX2/qugnQ2+hIFIWZolBm6OmjYLGAR36nKvpdfkQyLhaBPfIT6Kp9YVwR6oJyKIAJAIujFIeP5/uT22DI7zxWGOMY2IcjPv+/hEAU8jVYaSs4NIGpEc8O/9FJW7bdjqQZ4nsGs6vwsG+u1ay8KStDCeXazinQ/H/TvhKHKFTuLd32fmi0KW9vTSfKDNENBSWz2YSrUBG1yLTQMkl/VJ4M3o5MclTL3CeRjGSlDEDEcP3Snh43tJvPkpbDW90M3hCk3oN3nRj4Z2VwReyTMEpttj815eR+c/GA3xhtQZy19dM1kiiJwOiFFMzs6h7ZtIIe9tPKXsoTJBwZpN+M+c3akSR+rqyoMyTUTiMBbtWJ7lzSLbBrMAzm5zXZ50Ps8rKg+Z0zKmQll3+gdw0fNM">(),
         IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">(),
         IlIililiil
      );
      this.IiIililiil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","60p30vingoxgc88iVUSeKYH56wtwEmtRIl79M0FjK77xHovr96C9tg==">(),
         IliIlllilIi<"IliIlllilIi","AN2wgrLtHp2kKChgI8UTU9hxC7+k729XkViRXOlA/AGSvNXnUnDZa9hfRUQPbkPFiQ9HnzDmRk+aLgQ8FmQKqukLB0QOf4iQIeNkf8HI7/oKfFnIpeBFPs207A1cFYKlZap+2WB1RTNz23ZeHYd19pN3pfylTiErMGHS7QKbaJcPrZRw50WyBCWCOdAOX4j9QvQKLIzl5VbyqCM=">(),
         IliIlllilIi<"IliIlllilIi","9Rn80amGvfw+tSy021NB057W+3Kuno1sRpJ7Y5uAwW13Xbk=">(),
         IlIliIlllIliIl.iliIiiliiiii()
      );
      this.liIililiil = new illlIlIlIillIlIl(
         IliIlllilIi<"IliIlllilIi","0BoIVVI2GM7hHd3bolilRsszObDAjQnvWT0lk5Pv9zL/puQSIRZg">(),
         IliIlllilIi<"IliIlllilIi","WHlVlaOakH78AXNCfH5o7ziEpckpLkQeL3fAfzIwPTo1s3wgVS9Ox5TB5tPrBaITZagcbP25+mgRTOTZbqw84KgiEKYkJLvZ9ZbnTxrYk8p7/QrzBQZvYu24u0usrie0sLkB6gN+CQlXtfKBl4BGg4QN3PjrfwEzJw3h8mQ=">(),
         82
      );
      this.iiIililiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","dODz+YG8JF9vZoTcIN0tEbMksNpTSjjkAUX2G4NU54Alr65ZGURTzw==">(),
         IliIlllilIi<"IliIlllilIi","JqK3mpBWmxfOoo6C6/DidfGjR3pmcc29M/eeoIHbPfRqWyfwTs6qjMcSBQmQ5SAq2osprtsBouybB2HxnsDh/xpLZk4HWfaivfq31U8yMfFcxdtrbibaMPh+7eUNtDpUKQxFdhH3YNhhNrBLq+MrBf4AidLRkN59vjc3ykvRd3E=">(),
         true
      );
      this.IIlililiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","X89z4W5RZ/KZTYlSSKxLp+4NfnzEkFxD/5zmAok15I0+Ry0JmHTl">(),
         IliIlllilIi<"IliIlllilIi","/4evJLTpf2VPEKneBz1LkkCwwkRaYafXsWZZQlpKI9Ro7e+y62dV8+FEMUvyl9hxe1ThekZmTaYu15ja2WBH90fR+SDVl9O6Usyn4Ial87AfYcJNP9/daDEmpwwMx4LhJQSnA5Q9u5SDHaHJ">(),
         true
      );
      this.lIlililiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","mZo2YhcBdPG12FLJ8WmiS9l9n8lJoXkcm3GoGs7q41zLWf8HIGi2Cw==">(),
         IliIlllilIi<"IliIlllilIi","5Mt+n5xFhJ5ptpWMJLXyeMifYn8d2Sjdz1lsWDeuRZq4xhEipNGUZtesXWOpLvjrI+pnacCQZBjJ8vWCPRxpsOGABm8NLEUr0elrwm07nuM1+v/IxxfWpUzVmjMJoxU=">(),
         false
      );
      this.iIlililiil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","T27av/3IzacYp4t0ODKfHc+5dkOzzt6u3dsOy+jwAqWvYLomrvM=">(),
         IliIlllilIi<"IliIlllilIi","RqsiyZZ4fwSKpnjldeyG9RDR423oJLAGv0F1+gpFuyvC0xDtETVcZ1CqIz1ZMSDcBgjTc+K0VCjf6ZZSTxI=">(),
         25,
         5,
         180,
         5
      );
      this.Illililiil = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","1VNM2iPHW5TAzkIu8qlfviB+IeMhAvE/LDuKvfrpbqGr/YtL08SUow==">(),
         IliIlllilIi<"IliIlllilIi","W3UOkyOaFG3mweKPPC/9cdWff1TUnvslKAj6kaArS2FjrO/nGC+K+a8ZkWKbMH6jY4PuQGwKAuxFBk10Hp2QqMtLdzFyPJ07hKpd8S36mvaDJUd4pvODsKUlJCieoN1NS7HtN8uKGI9fwGuVFgkfPvuQNXSpvek9zs3dUdlv/WASi60Acp9xaZHKtotUUQJ+wsaPUuhIb9FQSD6VoksDWNSnch6x2tWmzDbd7hRa">(),
         IliIlllilIi<"IliIlllilIi","giljH4AaI5aXIvMgqWHZUY6qQuZdHBOcvypRNBoc1TOt">(),
         IliIlllilIi<"IliIlllilIi","giljH4AaI5aXIvMgqWHZUY6qQuZdHBOcvypRNBoc1TOt">(),
         IliIlllilIi<"IliIlllilIi","JVPfoiN0fcZbX/SA/jpKeU4MwQCUQUD28PPRzWyeiN6Jc7O7KQ==">(),
         IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">()
      );
      this.lllililiil = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","5BCtnCJryVDeh1PNPSQClU/1woFdX+yhwYnWQR+0SqYX/OpzSYv4ww==">(),
         IliIlllilIi<"IliIlllilIi","AbZVl+BGiPc5bzt4+ImM9uHd11qXi18GJSZucZwP6/MNFHpwcRFxvIYzbWfBWPvZ8xcCJ0n4XVEinwefQWmrlLfUPZsBiVy/qV6d1JZHv/KOcmP+EAL6ftjVvYxvbnxpY2o2ivQCpeqiQc8AEGHCgYsc1MFAN90IsiXQ4xC1l5pCeOmRLrHbspmb">(),
         0.8,
         0.0,
         1.0,
         0.05
      );
      this.illililiil = new ililliIiIiilliIi(
         IliIlllilIi<"IliIlllilIi","Wllk2ADOLjdDKCKV2bbGZ/ae0u056a78yzBTzio8gjjkyVY=">(),
         IliIlllilIi<"IliIlllilIi","IPaHuTwQ5ctjXL4X9AARH7SjGc4QQRsWGyX9MxqpBhoivqLx0mRTbGVmiBaXLpy+MQDI2ryZLdVG40IHoFEOH6GwyLLaySADvwDiNxZxzNEHYfupI2CxB9iXO4YmiiTJrunnUtoLq1bRXgqdJOFq+5xBHrwdKrU=">(),
         IliIlllilIi<"IliIlllilIi","Wllk2ADOLjdDKCKV2bbGZ/ae0u056a78yzBTzio8gjjkyVY=">(),
         this::liIlliiIll
      );
      this.Iilililiil = -1L;
      this.lilililiil = 1;
      this.iilililiil = 900;
      this.IIiililiil = 1;
      this.lIiililiil = illIiiliil;
      this.iIiililiil = 0L;
      this.Iliililiil = null;
      this.iliililiil = null;
      this.Iiiililiil = List.of();
      this.liiililiil = new float[0];
      this.iiiililiil = 0L;
      this.IIIIiiliil = 0L;
      this.lIIIiiliil = new IlIlIIilllIlIIil();
      this.iIIIiiliil = new lililiiiililii() {
         @Override
         public void liiiIIllIl(long run) {
            IIiiIIlilIiiIIli.lIiiIiIlilli(run);
         }

         @Override
         public void IliIlllilIi(int cue) {
            List var2 = IIlllIIilIlllIIi.this.Iiiililiil;
            if (cue >= 0 && cue < var2.size()) {
               iIIIIIliIlIIIIli var3 = (iIIIIIliIlIIIIli)var2.get(cue);
               IIlllIIilIlllIIi.this.illilIilil(var3.liiiIIllIl(), var3.iIlIlllllill(), var3.IilliliilIIi(), IIlllIIilIlllIIi.this.lIIIiiliil.IliIlllilIi());
            }
         }
      };
      this.IlIIiiliil = 0.0F;
      this.llIIiiliil = null;
      this.ilIIiiliil = 0;
      this.IiIIiiliil = 0L;
      this.liIIiiliil = 0L;
      this.IIlIiiliil = false;
      this.lIlIiiliil = List.of();
      this.iIlIiiliil = new float[0];
      this.IllIiiliil = new IlIlIIilllIlIIil();
      this.lllIiiliil = new lililiiiililii() {
         @Override
         public void liiiIIllIl(long run) {
            IIiiIIlilIiiIIli.lIiiIiIlilli(run);
         }

         @Override
         public void IliIlllilIi(int cue) {
            List var2 = IIlllIIilIlllIIi.this.lIlIiiliil;
            if (cue >= 0 && cue < var2.size()) {
               iIiiiilIliiiil var3 = (iIiiiilIliiiil)var2.get(cue);
               IIlllIIilIlllIIi.this.illilIilil(var3.liiiIIllIl(), var3.iIlIlllllill(), var3.IilliliilIIi(), IIlllIIilIlllIIi.this.IllIiiliil.IliIlllilIi());
            }
         }
      };
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.llIililiil,
            this.ilIililiil,
            this.IiIililiil,
            this.illililiil,
            this.Illililiil,
            this.lllililiil,
            this.liIililiil,
            this.iiIililiil,
            this.IIlililiil,
            this.lIlililiil,
            this.iIlililiil
         }
      );
      IIIiIllllIIiIlll.IiIlliIliiIl();
      iIiIiliIliIili.iIlIlllllill(this::IlIllllIll);
   }

   static float iIIliIlIli(float a, int turns, iiiiiIlIIIIIll p) {
      float var3 = 360.0F * (float)turns * lIiIiiIiIi(a);
      float var4 = -p.IiIlliIliiIl() * iliIiIiiIi(a, 0.0F, 0.26F);
      float var5 = p.IIlllIlliIll() * iliIiIiiIi(a, 0.6F, 1.0F);
      return var3 + var4 + var5;
   }

   public boolean iIiilIliil() {
      return this.IIlIiiliil && iIiIiliIliIili.IIlllIlliIll(iiIiliiIIlilii.lIIllliIIl);
   }

   static iiiiiIlIIIIIll iIlIiIllIi(String style) {
      iiiiiIlIIIIIll var1 = style == null ? null : IilIiiliil.get(style);
      return var1 != null ? var1 : illIiiliil;
   }

   public String llliiillii() {
      return this.Illililiil.Iilllilliill();
   }

   public iiIiliiIIlilii ilIllIiIll() {
      return iiIiliiIIlilii.IIillIiliIil(this.ilIililiil.Iilllilliill());
   }

   public void liIiiiiIii(String picked) {
      if (picked != null && iiIiliiIIlilii.IIillIiliIil(picked) != null) {
         this.ilIililiil.IIillIiliIil(picked);
      } else if (picked != null && Arrays.asList(IIIililiil).contains(picked)) {
         String var2 = this.ilIililiil.Iilllilliill();
         if (iiIiliiIIlilii.IIillIiliIil(var2) != null) {
            this.ilIililiil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">());
            var2 = IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">();
         }

         if (iliiiIiiii.lIiiIiIlilli(picked)) {
            if (!IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">().equals(var2) && !picked.equals(var2)) {
               this.ilIililiil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">());
            }

            this.iliililiil = picked;
         } else if (!IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">().equals(picked) && iliiiIiiii.lIiiIiIlilli(var2)) {
            this.ilIililiil.IIillIiliIil(IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">());
         }

         this.llIililiil.IIillIiliIil(picked);
      }
   }

   private float liiIiiiiIi(float p) {
      return IIIlilIIli(p, this.lIiililiil);
   }

   public class_1799 iiIilIIlil(class_1309 stack, class_1799 ctx, class_811 entity) {
      if (entity != class_811.field_4320 && entity != class_811.field_4323) {
         return ctx;
      } else if (Iiiilllliiilll.field_1724 != null && stack == Iiiilllliiilll.field_1724 && ctx == Iiiilllliiilll.field_1724.method_6047()) {
         illIIlllIilIIlll var4 = this.lIIIiiIIIi(stack, ctx);
         if (var4 == null) {
            return ctx;
         } else {
            class_2960 var5 = lIIililiil.computeIfAbsent(
               var4.iIlIlllllill(), n -> class_2960.method_60655(IliIlllilIi<"IliIlllilIi","fMywn64ZRRaLhC/lutF5kYzueQlUEWg96ifkJ6rMAbbRJVqL/QI=">(), n)
            );
            class_1092 var6 = Iiiilllliiilll.method_1554();
            if (var6 != null && var6.method_65746(var5) != var6.method_65746(iIIililiil)) {
               class_1799 var7 = ctx.method_7972();
               var7.method_57379(class_9334.field_54199, var5);
               return var7;
            } else {
               return ctx;
            }
         }
      } else {
         return ctx;
      }
   }

   private boolean IIIillIIil(class_1799 stack) {
      return this.IliIlllilIi()
         && !stack.method_7960()
         && stack.method_31573(class_3489.field_42611)
         && !IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">().equals(this.ilIililiil.Iilllilliill());
   }

   public String iiiIlIIIll(String what) {
      long var3 = 6736232850417570474L;
      if (IliIlllilIi<"IliIlllilIi","sZv74tA4AAkDgNNRIPXoHBnVB52zJ5CJT+Q1Yjl0YFs=">().equals(what) && Iiiilllliiilll.field_1724 != null) {
         var3 ^= ((long)Iiiilllliiilll.field_1724.method_31548().method_67532() << 32 ^ var3) & -1L << 32;
         Iiiilllliiilll.field_1724.method_31548().method_61496((int)(var3 >>> 32) == 0 ? 1 : 0);
         return IliIlllilIi<"IliIlllilIi","4rXBps9EshHbSt/3R21OJH6arLKlM9MTHeJ9nllek5LbQHXf5dLZAQ==">();
      } else {
         if (!Iiiilllliiilll.method_1569()) {
            Iiiilllliiilll.method_15995(true);
         }

         this.Iillllilll();
         return IliIlllilIi<"IliIlllilIi","GXV+dn3k6SYujAR5LiM6GvLfdAjP1fRPD2fOzG/qG/DruYovPZYt">()
            + this.IIlIiiliil
            + IliIlllilIi<"IliIlllilIi","nkTK23rV8FN7hlxLBIhGCSiVd4GeA0dSYQ97KvURYi4EIomh">()
            + iIiIiliIliIili.IIIllIIliIIl()
            + IliIlllilIi<"IliIlllilIi","zj/JCppQZ+aLBsR3V9QYWZn57sqGSlXsLuqJIoiiE8xX5r9dD0yjVg==">()
            + iIiIiliIliIili.Ililllililil()
            + IliIlllilIi<"IliIlllilIi","OSCmBgSvh2EJR3YDJd7m7OAPVzBL5HkSPtci46nKoGqGnQ==">()
            + iIiIiliIliIili.Iiilliiliiil()
            + IliIlllilIi<"IliIlllilIi","O9Z4tkWAL0EN05x/m1U6HXMgkbSMEhWgAaatq/SZyn3fzaGz0g==">()
            + Iiiilllliiilll.method_1569();
      }
   }

   public void llIliilIli(class_4587 arm, int side, class_1306 m) {
      float var4 = this.iilIiIIiIi();
      float var5 = this.liiIiiiiIi(var4);
      float var6 = iliIiIiiIi(var4, 0.0F, 0.26F);
      arm.method_46416((float)side * (-0.22F * var5 + 0.05F * var6), 0.16F * var5 - 0.05F * var6, -0.34F * var5 + 0.09F * var6);
      float var7 = (float)side * 0.56F;
      float var8 = -0.52F;
      float var9 = -0.72F;
      arm.method_46416(var7, var8, var9);
      arm.method_22907(class_7833.field_40718.rotationDegrees((float)side * this.lIiililiil.iliIiiliiiii() * var5));
      arm.method_22907(class_7833.field_40716.rotationDegrees((float)side * this.lIiililiil.IIIllIIliIIl() * var5));
      arm.method_22907(class_7833.field_40714.rotationDegrees(this.lIiililiil.IlIlllIlilIl() * var5));
      arm.method_46416(-var7, -var8, -var9);
   }

   static float lIiIiiIiIi(float x) {
      return x < 0.5F
         ? 4.0F * x * x * x
         : 1.0F - (float)Math.pow((double)(-2.0F * x + 2.0F), Double.longBitsToDouble(7711182317572513966L ^ 3101748098958811310L)) / 2.0F;
   }

   public static List<String> iIiliIlili() {
      return iilIiiliil;
   }

   public static void Iiiilliiil(class_1309 hand, class_1268 entity) {
      IIlllIIilIlllIIi var2 = (IIlllIIilIlllIIi)llilIllililIll.iliIiiliiiii(IIlllIIilIlllIIi.class);
      if (var2 != null) {
         var2.iiiilIIIIi(hand, entity);
      }
   }

   @Override
   protected void Illillliilli() {
      this.IIllllIlll();
   }

   private void Iillllilll() {
      class_1799 var1 = Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_6047() : class_1799.field_8037;
      if (var1 != null && !var1.method_7960()) {
         if (!this.IIlililiil.Iilllilliill() || iiliiIIiii(var1)) {
            boolean var2 = this.IIIillIIil(var1);
            if (var2 && this.IIlIiiliil && iiIiliiIIlilii.IIillIiliIil(this.ilIililiil.Iilllilliill()) != null) {
               if (iIiIiliIliIili.IIiilIiiiIii(Iiiilllliiilll.field_1724, class_1268.field_5808, var1)) {
                  this.Iliililiil = null;
                  this.Iilililiil = -1L;
                  this.iIiililiil = iIlllIllll();
                  iIiIiliIliIili.IIillIiliIil();
               }
            } else {
               String var3 = this.IIlIilIlIi(
                  var2 && IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">().equals(this.ilIililiil.Iilllilliill())
               );
               String var4 = var2 ? this.iIIilIlIil(var3) : null;
               if (var4 != null && this.IIlIiiliil && illIIlllIilIIlll.IIIllIIliIIl(var4) == illIIlllIilIIlll.liIIIIIill) {
                  String var5 = this.iliililiil;
                  this.iliililiil = var4;
                  if (iIiIiliIliIili.IIiilIiiiIii(Iiiilllliiilll.field_1724, class_1268.field_5808, var1)) {
                     this.Iliililiil = null;
                     this.Iilililiil = -1L;
                     this.iIiililiil = iIlllIllll();
                     iIiIiliIliIili.IIillIiliIil();
                     return;
                  }

                  this.iliililiil = var5;
               }

               String var9 = var4 != null
                  ? var4
                  : (iliiiIiiii.lIiiIiIlilli(var3) ? IliIlllilIi<"IliIlllilIi","ujX8xr/WOWxV7YbW/VB8iUuORi+J/T2f/RiYBDulyMM=">() : var3);
               this.lilililiil = llIililIil(var9);
               String var6 = this.llIililiil.Iilllilliill();
               iiiiiIlIIIIIll var7 = iIlIiIllIi(var9);
               this.lIiililiil = IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">().equals(var6) ? var7 : iIlIiIllIi(var6);
               this.iilililiil = var7.IliIlllilIi();
               int var8 = var7.liiiIIllIl();
               this.IIiililiil = Math.max(1, var8);
               this.Iliililiil = var4 != null ? iliiiIiiii.IIIllIIliIIl(var4, var7.IiIlliIliiIl(), var7.IIlllIlliIll(), var8) : null;
               if (this.Iliililiil != null) {
                  this.iilililiil = Math.round((float)this.iilililiil * iliiiIiiii.iliIiiliiiii(var4, var8));
               }

               if (this.Iliililiil != null) {
                  this.iliililiil = var4;
               }

               this.Iiiililiil = this.Iliililiil != null ? iilliliIIilili.IilliliilIIi(var4, this.Iliililiil, (double)this.iilililiil / 1000.0) : List.of();
               this.liiililiil = iilllIIill(this.Iiiililiil, (float)this.iilililiil / 1000.0F);
               this.Iilililiil = iIlllIllll();
               this.iiiililiil = IIiiIIlilIiiIIli.IilliliilIIi();
               this.iIiililiil = this.Iilililiil;
               this.ilillIiill();
            }
         }
      }
   }

   private static String[] lIIlliIIll() {
      ArrayList var0 = new ArrayList<>(
         List.of(
            IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">(),
            IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">(),
            IliIlllilIi<"IliIlllilIi","mIpVZMbjDCRqMPldHIqqe6YvsKpqL2MPVLHIz/n5Lwkswqo53Mc=">(),
            IliIlllilIi<"IliIlllilIi","sk55ijK12Kcw8YhMXagTkaQGePnmHMK63k5x+9glweAga3LG">(),
            IliIlllilIi<"IliIlllilIi","KDycO9az/eJM8Qv6TgnS7E2NgWeo7hvCUwJKcQ3/TuErZILBsA==">()
         )
      );
      var0.addAll(iiIiliiIIlilii.Illlllllilll());
      return var0.toArray(String[]::new);
   }

   private void Illillllil(String pitch, float sound, float volume) {
      this.illilIilil(pitch, sound, volume, 0L);
   }

   public illIIlllIilIIlll IiIilliIil(class_1309 hand, class_1268 entity, class_1799 stack) {
      return entity != class_1268.field_5808 ? null : this.lIIIiiIIIi(hand, stack);
   }

   public void iIliiIllii(int dir) {
      String[] var2 = IlIliIlllIliIl.iliIiiliiiii();
      if (var2.length != 0 && dir != 0) {
         int var3 = 0;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].equals(this.IiIililiil.Iilllilliill())) {
               var3 = var4;
            }
         }

         this.IiIililiil.IIillIiliIil(var2[Math.floorMod(var3 + dir, var2.length)]);
      }
   }

   private void lililiilil() {
      int var1 = System.identityHashCode(Iiiilllliiilll.field_1724);
      if (var1 != this.ilIIiiliil) {
         this.ilIIiiliil = var1;
         this.llIIiiliil = null;
      }

      class_1799 var2 = Iiiilllliiilll.field_1724.method_6047();
      String var3 = Iiiilllliiilll.field_1724.method_31548().method_67532()
         + IliIlllilIi<"IliIlllilIi","m1sJSfgXSYplpvCJYIl5hbKZfgc8CQWlbZX7HI0=">()
         + var2.method_7909();
      if (!var3.equals(this.llIIiiliil)) {
         boolean var4 = this.llIIiiliil == null;
         this.llIIiiliil = var3;
         IIiiIIlilIiiIIli.lIiiIiIlilli(this.IIIIiiliil);
         this.IIIIiiliil = 0L;
         boolean var5 = !var4 && Iiiilllliiilll.field_1690.method_31044().method_31034();
         illIIlllIilIIlll var6 = var5 ? this.lIIIiiIIIi(Iiiilllliiilll.field_1724, var2) : null;
         iiIiliiIIlilii var7 = var5 && var6 == null ? this.IlIllllIll(Iiiilllliiilll.field_1724, var2) : null;
         boolean var8 = var7 != null;
         long var9 = iIlllIllll();
         if ((var6 != null || var8) && var9 - this.IiIIiiliil >= 400L) {
            this.IiIIiiliil = var9;
            boolean var11 = var6 == illIIlllIilIIlll.liIIIIIill || var8 && var7.liiiIIllIl();
            this.IIIIiiliil = IIiiIIlilIiiIIli.IilliliilIIi();
            this.illilIilil(
               var11
                  ? IliIlllilIi<"IliIlllilIi","T0wZc131OprCxJmllTVAYUzIbcRQnitHL0ZLeJNjt9q8tnPubOurQhAId/E=">()
                  : IliIlllilIi<"IliIlllilIi","Uu21LmFUYfkXkNDt7+OIAJ0uYHCH3gbe/Pq7S6YDYTRI8w==">(),
               var11 ? 0.5F : 0.45F,
               1.0F,
               this.IIIIiiliil
            );
         }
      }
   }

   public void lliililiil(class_742 player, class_1799 queue, class_4587 light, class_11659 matrices, int stack) {
      iIiIiliIliIili.Iiiiliiiiiii(
         player, light, matrices, stack, IlIliIlllIliIl.IIIllIIliIIl(this.IiIililiil.Iilllilliill()), queue != null && queue.method_7958()
      );
      this.liilliiill();
   }

   static float[] lIilliIill(List<iIiiiilIliiiil> contacts) {
      float[] var1 = new float[contacts.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = ((iIiiiilIliiiil)contacts.get(var2)).IliIlllilIi();
      }

      return var1;
   }

   public IntToDoubleFunction lIliliIlil(float swingProgress) {
      long var5 = 4797479288263361728L;
      var5 ^= ((long)(!(swingProgress > 0.0F) || !(this.IlIIiiliil <= 0.0F) && !(swingProgress < this.IlIIiiliil - 0.2F) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      this.IlIIiiliil = swingProgress;
      if ((int)(var5 >>> 32) != 0 && iIlllIllll() - this.liIIiiliil >= (3010268423341477234L ^ 3010268423341476958L)) {
         this.liIIiiliil = iIlllIllll();
         this.Illillllil(IliIlllilIi<"IliIlllilIi","VcM70A9sVaYHs3S6kxgd2eTMY2PEfpRpI0F6LnMHVbin">(), 0.26F, 1.0F);
      }

      iliiiIiiii var3 = this.Iliililiil;
      if (var3 != null && this.lllIiillIi()) {
         float var4 = this.iilIiIIiIi();
         this.lIIIiiliil
            .lIiiIiIlilli(
               this.iiiililiil, this.liiililiil, (float)this.iilililiil / 1000.0F, var4 * (float)this.iilililiil / 1000.0F, this.Ilillllill(), this.iIIIiiliil
            );
         return ch -> (double)var3.IliIlllilIi(ch, var4);
      } else {
         this.ilillIiill();
         return ch -> 0.0;
      }
   }

   private boolean Ilillllill() {
      return IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">().equals(this.Illililiil.Iilllilliill()) || Iiiilllliiilll.method_1493();
   }

   private static int llIililIil(String s) {
      for (int var1 = 1; var1 < IIIililiil.length; var1++) {
         if (IIIililiil[var1].equals(s)) {
            return var1;
         }
      }

      return 1;
   }

   public boolean ilIIiIiIIi(illIIlllIilIIlll rig) {
      class_1092 var2 = Iiiilllliiilll.method_1554();
      if (var2 == null) {
         return false;
      } else {
         class_10439 var3 = var2.method_65746(iIIililiil);

         for (int var4 = 0; var4 < rig.IlIlllIlilIl(); var4++) {
            class_2960 var5 = lIIililiil.computeIfAbsent(
               rig.IiIlliIliiIl(var4).IliIlllilIi(),
               n -> class_2960.method_60655(IliIlllilIi<"IliIlllilIi","fMywn64ZRRaLhC/lutF5kYzueQlUEWg96ifkJ6rMAbbRJVqL/QI=">(), n)
            );
            if (var2.method_65746(var5) == var3) {
               return false;
            }
         }

         return true;
      }
   }

   static void Illlilllli(class_4587 style, String a, float m, int turns, iiiiiIlIIIIIll p) {
      float var5 = IIIlilIIli(m, p);
      int var6 = Math.max(1, turns);
      float var7 = (float) (Math.PI * 2);
      switch (a) {
         case IliIlllilIi<"IliIlllilIi","ujX8xr/WOWxV7YbW/VB8iUuORi+J/T2f/RiYBDulyMM=">():
            style.method_22907(class_7833.field_40716.rotationDegrees(iIIliIlIli(m, var6, p)));
            break;
         case IliIlllilIi<"IliIlllilIi","KXd+wd2GQriP7jpd1roSmb172zcGYwSp417OsEzDCes=">():
            style.method_22907(class_7833.field_40714.rotationDegrees(iIIliIlIli(m, var6, p)));
            break;
         case IliIlllilIi<"IliIlllilIi","0hb2kbbV6wEGAxVSwHOQP4Kvoylfr7pAkF0NWp+c/DM7yuiGWAu6">():
            style.method_22907(class_7833.field_40718.rotationDegrees(iIIliIlIli(m, var6, p)));
            break;
         case IliIlllilIi<"IliIlllilIi","oZTVOS9srjER6DPYQaBDL4FiHHC8g7KUmnZCu7exHb8x">():
            style.method_22907(class_7833.field_40718.rotationDegrees(iIIliIlIli(m, var6, p)));
            style.method_22907(class_7833.field_40716.rotationDegrees(16.0F * class_3532.method_15374((double)(var7 * m)) * var5));
            break;
         case IliIlllilIi<"IliIlllilIi","JL1B1+yiQRjQfywXwefPeCYwVd1Ikg4di1wwmD034P8=">():
            float var10 = 4.0F * m * (1.0F - m);
            style.method_46416(0.0F, 0.62F * var10, -0.12F * var10);
            style.method_22907(class_7833.field_40714.rotationDegrees(iIIliIlIli(m, var6, p)));
            break;
         default:
            style.method_22907(class_7833.field_40716.rotationDegrees(iIIliIlIli(m, var6, p)));
      }
   }

   public String Iiililiili() {
      String var1 = this.ilIililiil.Iilllilliill();
      return iiIiliiIIlilii.IIillIiliIil(var1) != null ? var1 : this.llIililiil.Iilllilliill();
   }

   public void iiIliIIlli(class_4587 side, int m, class_1306 arm) {
      float var4 = this.liiIiiiiIi(this.iilIiIIiIi());
      side.method_46416((float)m * this.lIiililiil.lIiiIiIlilli() * var4, this.lIiililiil.iIlIlllllill() * var4, this.lIiililiil.IilliliilIIi() * var4);
   }

   public boolean IilIililIi(class_1268 hand, class_1799 item) {
      if (!this.IliIlllilIi() || hand != class_1268.field_5808) {
         return false;
      } else if (item == null || item.method_7960()) {
         return false;
      } else {
         return this.IIlililiil.Iilllilliill() && !iiliiIIiii(item) ? false : this.lllIiillIi();
      }
   }

   private float iilIiIIiIi() {
      return lIiiiiIiii((float)(iIlllIllll() - this.Iilililiil) / (float)Math.max(1, this.iilililiil));
   }

   public String IlIIillIIi() {
      return this.IiIililiil.Iilllilliill();
   }

   private void illilIilil(String pitch, float sound, float run, long volume) {
      IIiiIIlilIiiIIli.liiiIIllIl(this.Illililiil.Iilllilliill(), pitch, sound * iilliliIIilili.IliIlllilIi(this.lllililiil.Iilllilliill()), run, volume);
   }

   private void liilliiill() {
      long var1 = this.IIlIiiliil ? iIiIiliIliIili.IlIillIiilIi() : 0L;
      if (var1 != this.IllIiiliil.IliIlllilIi()) {
         this.lIlIiiliil = var1 != (-5389401447650551765L ^ -5389401447650551765L) ? iIiIiliIliIili.Illillliilli() : List.of();
         this.iIlIiiliil = lIilliIill(this.lIlIiiliil);
      }

      this.IllIiiliil
         .lIiiIiIlilli(
            var1,
            this.iIlIiiliil,
            iIiIiliIliIili.IIlilIliiIli(),
            var1 != (-6132967873837393037L ^ -6132967873837393037L) ? iIiIiliIliIili.IiIiliIiiiIi() : 0.0F,
            this.Ilillllill(),
            this.lllIiiliil
         );
   }

   public String ilIiiIiIii(String picked) {
      String var2 = this.ilIililiil.Iilllilliill();
      if (IliIlllilIi<"IliIlllilIi","ROxi55o4gxlar/2TSVFJ+Atn3RNG9BlQB0zD7d+YSQ==">().equals(var2)) {
         return null;
      } else if (!IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">().equals(var2)) {
         return iliiiIiiii.lIiiIiIlilli(var2) ? var2 : null;
      } else {
         return iliiiIiiii.lIiiIiIlilli(picked) ? picked : null;
      }
   }

   static float lIiiiiIiii(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private String iIIilIlIil(String rolled) {
      String var2 = this.ilIililiil.Iilllilliill();
      if (!IliIlllilIi<"IliIlllilIi","VkcOdds87NY3pVK+wyP2Dv826u56+lQirY5fQbSUAes=">().equals(var2)) {
         return iliiiIiiii.lIiiIiIlilli(var2) ? var2 : null;
      } else {
         String var3 = this.llIililiil.Iilllilliill();
         if (iliiiIiiii.lIiiIiIlilli(var3)) {
            return var3;
         } else if (!IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">().equals(var3)) {
            return null;
         } else if (iliiiIiiii.lIiiIiIlilli(rolled)) {
            return rolled;
         } else {
            return this.iliililiil != null ? this.iliililiil : IliIlllilIi<"IliIlllilIi","KDycO9az/eJM8Qv6TgnS7E2NgWeo7hvCUwJKcQ3/TuErZILBsA==">();
         }
      }
   }

   private String IIlIilIlIi(boolean knives) {
      String var2 = this.llIililiil.Iilllilliill();
      if (!IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">().equals(var2)) {
         return var2;
      } else {
         ArrayList var3 = new ArrayList();

         for (int var4 = 1; var4 < IIIililiil.length; var4++) {
            if (iliiiIiiii.lIiiIiIlilli(IIIililiil[var4]) == knives) {
               var3.add(IIIililiil[var4]);
            }
         }

         return var3.isEmpty() ? IIIililiil[1] : (String)var3.get(ThreadLocalRandom.current().nextInt(var3.size()));
      }
   }

   public static void illliIilli(class_4587 style, String p, float m) {
      iiiiiIlIIIIIll var3 = iIlIiIllIi(p);
      Illlilllli(style, p, lIiiiiIiii(m), var3.liiiIIllIl(), var3);
   }

   private void ilillIiill() {
      long var5 = 8273481956495890468L;
      var5 ^= ((long)(this.Iliililiil != null && this.lllIiillIi() ? 1 : 0) << 32 ^ var5) & -1L << 32;
      long var2 = (int)(var5 >>> 32) != 0 ? this.iiiililiil : 0L;
      float var4 = (int)(var5 >>> 32) != 0 ? (float)(iIlllIllll() - this.Iilililiil) / 1000.0F : 0.0F;
      this.lIIIiiliil.lIiiIiIlilli(var2, this.liiililiil, (float)this.iilililiil / 1000.0F, var4, this.Ilillllill(), this.iIIIiiliil);
   }

   public static float lilliiilli(String style) {
      iiiiiIlIIIIIll var1 = iIlIiIllIi(style);
      float var2 = (float)var1.IliIlllilIi();
      if (iliiiIiiii.lIiiIiIlilli(style)) {
         var2 *= iliiiIiiii.iliIiiliiiii(style, var1.liiiIIllIl());
      }

      return var2 / 1000.0F;
   }

   @Override
   public boolean lliIliliIl() {
      return true;
   }

   public float Iiliililii() {
      return iilliliIIilili.IliIlllilIi(this.lllililiil.Iilllilliill());
   }

   private static List<String> lliliilili() {
      ArrayList var0 = new ArrayList<>(
         List.of(
            IliIlllilIi<"IliIlllilIi","KDycO9az/eJM8Qv6TgnS7E2NgWeo7hvCUwJKcQ3/TuErZILBsA==">(),
            IliIlllilIi<"IliIlllilIi","mIpVZMbjDCRqMPldHIqqe6YvsKpqL2MPVLHIz/n5Lwkswqo53Mc=">(),
            IliIlllilIi<"IliIlllilIi","sk55ijK12Kcw8YhMXagTkaQGePnmHMK63k5x+9glweAga3LG">()
         )
      );
      var0.addAll(iiIiliiIIlilii.Illlllllilll());
      var0.addAll(
         List.of(
            IliIlllilIi<"IliIlllilIi","F/kfIO059vWVu8FyhS5uBX9+Es8djRDLwE8A3L8Y+2S4Iw==">(),
            IliIlllilIi<"IliIlllilIi","ujX8xr/WOWxV7YbW/VB8iUuORi+J/T2f/RiYBDulyMM=">(),
            IliIlllilIi<"IliIlllilIi","KXd+wd2GQriP7jpd1roSmb172zcGYwSp417OsEzDCes=">(),
            IliIlllilIi<"IliIlllilIi","0hb2kbbV6wEGAxVSwHOQP4Kvoylfr7pAkF0NWp+c/DM7yuiGWAu6">(),
            IliIlllilIi<"IliIlllilIi","oZTVOS9srjER6DPYQaBDL4FiHHC8g7KUmnZCu7exHb8x">(),
            IliIlllilIi<"IliIlllilIi","JL1B1+yiQRjQfywXwefPeCYwVd1Ikg4di1wwmD034P8=">()
         )
      );
      return List.copyOf(var0);
   }
}
