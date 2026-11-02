package gg.corz;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.BooleanSupplier;
import net.minecraft.class_10938;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2649;
import net.minecraft.class_2653;
import net.minecraft.class_2724;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_418;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_9835;
import net.minecraft.class_10936.class_10937;
import net.minecraft.class_2846.class_2847;

public class IIIIilIilIIIilIi extends ilIllIiIll {
   private final boolean[] lIIliIlIIi;
   private static volatile int IlIIiIlIIi = -1;
   private boolean liIilIlIIi;
   private boolean iIlilIlIIi;
   private int illIiIlIIi;
   private final Random IiIilIlIIi;
   private int IIiIiIlIIi;
   private int liiIiIlIIi;
   private static volatile BooleanSupplier llIliIlIIi;
   private static volatile Object iIIliIlIIi;
   private static final long IIIliIlIIi = 600L;
   private int IliIiIlIIi;
   private long IIiilIlIIi;
   private static final long iiIIiIlIIi = 150L;
   private int lIlilIlIIi;
   private final IIiIlilIiIli IliilIlIIi;
   private static final long lilIiIlIIi = 600L;
   static final int ilIliIlIIi = 0;
   private final iiIiiilIIliiil IlIilIlIIi;
   private int IIlilIlIIi;
   private long iIiilIlIIi;
   private float IililIlIIi;
   private static final int iIillIlIIi = 40;
   private boolean iililIlIIi;
   private static final long liIIiIlIIi = 500L;
   private boolean lllilIlIIi;
   private long illilIlIIi;
   private final iilliIlIIiliIl IIIilIlIIi;
   private int IIlIiIlIIi;
   private int IiiIiIlIIi;
   private Runnable iiiIiIlIIi;
   static final int IIlliIlIIi = 1;
   private static volatile String IiIIiIlIIi = "";
   private int lililIlIIi;
   private volatile long liiilIlIIi;
   private static volatile long llIIiIlIIi;
   private static volatile boolean IilIiIlIIi;
   static final int iiIliIlIIi = 0;
   static final int IiIliIlIIi = 1;
   private volatile long IiiilIlIIi;
   private int lllIiIlIIi;
   private static final long IllIiIlIIi = 150L;
   static final int lIlliIlIIi = 2;
   private final iiIiiilIIliiil llillIlIIi;
   private static final long lliilIlIIi = 1500L;
   private static volatile int iIIIiIlIIi = -1;
   private long lIlIiIlIIi;
   private static final long IIIIiIlIIi = 60L;
   private IIlllilIllli lIIIiIlIIi;
   private final iiIiiilIIliiil lIIilIlIIi;
   private static final int IllliIlIIi = 4;
   private IiIlIillliIlIill iilIiIlIIi;
   private final iilliIlIIiliIl iiillIlIIi;
   private boolean iiiilIlIIi;
   private long iIlIiIlIIi;
   private static final int iliIiIlIIi = 10;
   static final float iIlliIlIIi = 1.0F;
   private static final AtomicIntegerArray ilIIiIlIIi = new AtomicIntegerArray((-78467222 + 117 << 19 | -78467222 + 117 >>> 13) - 89 + -81 ^ 2130696645);
   private final iiIiiilIIliiil iIIilIlIIi;
   private static final long lIiilIlIIi = 400L;
   private static final int lIillIlIIi = 40;
   private final iiIiiilIIliiil IiillIlIIi;
   private int iiIilIlIIi;
   private final iiIiiilIIliiil llIilIlIIi;
   private final iilliIlIIiliIl liillIlIIi;
   private int lIiIiIlIIi;
   private final iilliIlIIiliIl ilillIlIIi;
   private boolean IllilIlIIi;
   private final iiIiiilIIliiil ilIilIlIIi;
   private static final long iliilIlIIi = 250L;
   private final iiIiiilIIliiil IlillIlIIi = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","gcLLdVxBQxaXkDVpxwUmvn2SkepEeJkuzBeJAvvBFtUGNvFV7WU=">(),
      IliIlllilIi<"IliIlllilIi","Ty4ZqwqlEYb7itdrHdjGFzdi1ctFTh6L8rgPqXzNhUzcpVejOXY7gjQYBu1J4vyXu/jD5ATcZdjy0uwI0/d/mF2jfILaZ27keKDPFsHLjRNFb+lXLYhn2iMnR/YThqhofAEi/PkZndvUgrd0aNEJcNH8GU4TeGowOioPohVKRMKlyQFzVUctG/MKxNiu7wLYEk+l+tAheZoy77P3Ady8tXajiC9YgfT/OReCkuZRd0J0p90JBHZ2it5IAbpMOuP0iZI1b/5s7e1QVFW6+m8vVIQ4dd2Z/eE29Vg3iMQqrLzrApu2FGThzQRr9k3YNL9qB9JX5o60ViNV/d4yKfgsuAOjduULDzSzpwV2fCgncI6dOez3jQqbi7r1ukxmwuMXKDX2Giifhsq0kWLW9YPKQI40vxblsjU+uQ8H9lASmvumHh5NjkEJrYw6mwOOszZXQogKKiDOtbYSffYpuf6qEY2v2pAeAlN96KU6QknVsQuIMDOJQl4T3NYmWe2ZhhR07idNTkqYFodsTdxfjfF6d77fSWJL2dRYFhqMpntUCr0IEz+24pzysTduI+mtEOZzL8jjyi0OAeiWFvbaW6kSYmyan/3LFnIzvPHu/wTKkMbgLkCrrJKtdf3r5Bkb2tM944fOJU76wSErQjUHWGudVLATduuWrPduRbqj5Q==">(),
      false
   );
   private int iIiIiIlIIi;
   private static volatile BooleanSupplier IlIliIlIIi;
   private static final int lliIiIlIIi = 40;
   static final int liIliIlIIi = 2;

   public static boolean ilIllIiIll(int hotbarSlot) {
      IIIIilIilIIIilIi var1 = liIlliiIll();
      return var1 != null
         && hotbarSlot >= 0
         && hotbarSlot < ((-329346504 * -1171354717 * 3 << 25 | -329346504 * -1171354717 * 3 >>> 7) ^ -253885184)
         && var1.lIIliIlIIi[hotbarSlot];
   }

   private void liIIiiiIIi(long now) {
      IIlllilIllli var3 = this.lIIIiIlIIi;
      if (var3 != null) {
         class_1661 var4 = Iiiilllliiilll.field_1724.method_31548();
         long var5 = now - var3.IliIlllilIi();
         boolean var7 = ilIIiIlIIi.get(var3.lIiiIiIlilli()) > var3.IiIlliIliiIl();
         boolean var8 = ilIIiIlIIi.get(var3.iliIiiliiiii()) > var3.IIlllIlliIll();
         boolean var9 = llIIiIlIIi > var3.Illlllllilll();
         boolean var10 = var7 || var8 || var9;
         boolean var11 = var4.method_5438(var3.IilliliilIIi()).method_31574(class_1802.field_8288);
         if (var10 && var11) {
            this.iIlIiIllIi();
         } else if (var10 && var5 >= 60L) {
            this.IIlIilIlIi(
               now,
               var3,
               IliIlllilIi<"IliIlllilIi","1kq4CRLe7S78IUqzpi3omDNqm4SmhvZzJA81iVyjIkV5Btg2d5sJ9fz52tHNyYsfjdn0">()
                  + (
                     var9
                        ? IliIlllilIi<"IliIlllilIi","Bjx/m7WhVWRSIRzjQZU0nNmVj+drF7OJcRXTbWPvSkQxe3qVA+gZhhi2+RCuJb6iuBI=">()
                        : IliIlllilIi<"IliIlllilIi","9RNw4jrDc+ha1gZFLGlSO8uwBn0+HJOmygdJwzlcWrV/Au6KPDzja9Q4d97n">()
                  )
                  + IliIlllilIi<"IliIlllilIi","EA2qP9jEapkDty1gfrTwudFodrzeEgPJwTsWyieRD89m+JM=">()
                  + var5
                  + IliIlllilIi<"IliIlllilIi","YH9gP1c5wViO3eurwM6Ufi/IZV+nqOwr9eKri9IYwwY=">()
                  + iliIiIiiIi(var3.IilliliilIIi())
                  + IliIlllilIi<"IliIlllilIi","std5AJTjyDEqG8eMp7dWefageQUbZK61qA7Hbcu1ihcNFVI=">()
                  + Illillllil(var4.method_5438(var3.IilliliilIIi()))
                  + IliIlllilIi<"IliIlllilIi","TNjW7mZyaSwpWBr4jULjgqfhAuvy9jiETHMGKfvY3RqK7A==">()
                  + var3.iIlIlllllill()
                  + IliIlllilIi<"IliIlllilIi","std5AJTjyDEqG8eMp7dWefageQUbZK61qA7Hbcu1ihcNFVI=">()
                  + Illillllil(var4.method_5438(var3.iIlIlllllill()))
                  + IliIlllilIi<"IliIlllilIi","QD/NAtl0FDZW3hE0592YaQ+hx8TpFmgh0hmAx/RNKfKywmR9XZ7onFYZPL3l6uNI">()
                  + IiIIiIlIIi
            );
            this.iIlIiIllIi();
         } else {
            if (var5 > 500L) {
               if (!var10) {
                  var4.method_5447(var3.iIlIlllllill(), var3.IIIllIIliIIl());
                  var4.method_5447(var3.IilliliilIIi(), var3.IlIlllIlilIl());
                  this.IIlIilIlIi(
                     now,
                     var3,
                     IliIlllilIi<"IliIlllilIi","oaMmy/JM8JI6yUTZf4E/z6QeWgQBCaXN7uHrx4Liv9/1I2hvRPjw9+5pXgLOPoVo3vYS5W436N/6csom">()
                        + var5
                        + IliIlllilIi<"IliIlllilIi","VhweLpiwePOjxj1AQkEEAlqBsWPpvLZ6Fzj6e/T19hG8TU0p/Pjd62LL+njeHlYq4WvwW57c6STn48j8Mpx5JAxlkjDg3nalDd0=">()
                        + IiIIiIlIIi
                  );
               } else {
                  this.IIlIilIlIi(
                     now,
                     var3,
                     IliIlllilIi<"IliIlllilIi","mF5FUGW4saqpM1ZLi4FwDT+LJsRK7KYHp/cf8VNQP5izD9WVzdXOX4z0x7NXZwAkV3FKmGLQbKQKJf2nPNNaROMgWorlkFTFAA==">()
                        + var5
                        + IliIlllilIi<"IliIlllilIi","r3Ge7rUv5uKpOtcyPmMRSPj2LLWu1HtBmS4CAelTWV9p">()
                        + iliIiIiiIi(var3.IilliliilIIi())
                        + IliIlllilIi<"IliIlllilIi","std5AJTjyDEqG8eMp7dWefageQUbZK61qA7Hbcu1ihcNFVI=">()
                        + Illillllil(var4.method_5438(var3.IilliliilIIi()))
                        + IliIlllilIi<"IliIlllilIi","QD/NAtl0FDZW3hE0592YaQ+hx8TpFmgh0hmAx/RNKfKywmR9XZ7onFYZPL3l6uNI">()
                        + IiIIiIlIIi
                  );
               }

               this.iIlIiIllIi();
            }
         }
      }
   }

   private int IliIilliIi() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      int var2 = this.IIililIili();
      if (var1.method_5438(var2).method_31574(class_1802.field_8288) && !iiiIlIIIll(var2)) {
         return var2;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            if (var1.method_5438(var3).method_31574(class_1802.field_8288) && !iiiIlIIIll(var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private void iiIilIIlil() {
      this.liIilIlIIi = false;
      this.lIlilIlIIi = 0;
      this.IIlilIlIIi = 0;
      this.iIlilIlIIi = false;
      this.IllilIlIIi = false;
      this.lllilIlIIi = false;
      this.iiiilIlIIi = false;
      this.iIiilIlIIi = 0L;
      this.IliilIlIIi.lIiiIiIlilli();
      this.iililIlIIi = false;
      this.IIiilIlIIi = 0L;
      this.illilIlIIi = 0L;
      this.IililIlIIi = 0.0F;
      this.lililIlIIi = Integer.MIN_VALUE;
      this.iIlIiIllIi();
      this.lIiIiiIiIi();
      this.iIlIiIlIIi = -1L;
      this.liiIiIlIIi = -1;
      this.iiiIiIlIIi = null;
      this.IiiIiIlIIi = Integer.MIN_VALUE;
      Arrays.fill(this.lIIliIlIIi, false);
   }

   public static boolean lIIlliIIll() {
      return IilIiIlIIi;
   }

   private void IlIIillIIi(int syncId, int fromHandlerSlot, int button) {
      this.ilIIiIiIIi(
         syncId,
         fromHandlerSlot,
         button,
         button == (-(-297645078) * -83 ^ 1065262326)
            ? IliIlllilIi<"IliIlllilIi","oFXJPdgMD8PVdi+JKvrnNQX2GHaw74E2noXZIfiJtGk2u4xu">()
            : IliIlllilIi<"IliIlllilIi","jfEa4KnMg1MrTfjS3OqvstRLiik+HaZnVNLpzFX/QJjfHZg=">()
      );
      if (this.IlIilIlIIi.Iilllilliill() && Iiiilllliiilll.method_1562() != null && !(Iiiilllliiilll.field_1755 instanceof class_465)) {
         Iiiilllliiilll.method_1562().method_52787(new class_2815(syncId));
      }
   }

   public static boolean iiiIlIIIll(int invSlot) {
      return invSlot == iIIIiIlIIi || invSlot == IlIIiIlIIi;
   }

   private void iIiilIliil(boolean fast) {
      if (this.iilIiIlIIi == null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.field_1724 != null) {
         if (this.iiIilIlIIi >= this.IliIiIlIIi && !this.IiIliliIli(System.currentTimeMillis())) {
            if (llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class) instanceof IIiiIillIiiIil var2 && var2.lliIIliliIIl()) {
               return;
            }

            if (lIlillliIlilll.IliIlllilIi(this)) {
               IiIlIillliIlIill var4 = new IiIlIillliIlIill(Iiiilllliiilll.field_1724, this);
               Iiiilllliiilll.method_1507(var4);
               if (Iiiilllliiilll.field_1755 != var4) {
                  lIlillliIlilll.liiiIIllIl(this);
               } else {
                  this.iilIiIlIIi = var4;
                  this.IIiIiIlIIi = this.iiIilIlIIi;
                  this.lIiIiIlIIi = this.iiIilIlIIi + (fast ? 1 : 2) + this.IiIilIlIIi.nextInt(2);
                  this.iIiIiIlIIi = -1;
               }
            }
         }
      }
   }

   private boolean lllIiillIi(long now) {
      long var6 = 1817037930741571785L;
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1562() != null) {
         var6 ^= ((long)this.IliIilliIi() << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) == (~2117908801 ^ 21 ^ 2117908820)) {
            return false;
         } else if (this.IiiIiIlIIi == Iiiilllliiilll.field_1724.field_6012) {
            return false;
         } else {
            if (llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class) instanceof IIiiIillIiiIil var4 && var4.IliIlllilIi() && var4.iIiIIlIliIIl()) {
               return false;
            }

            this.lllIiIlIIi = Iiiilllliiilll.field_1724.method_31548().method_67532();
            this.illIiIlIIi = (int)(var6 >>> 32);
            this.IIlIiIlIIi = 1;
            this.lIlIiIlIIi = now;
            IilIiIlIIi = true;
            IIiIIIlilIiIIIli.IliIlllilIi((int)(var6 >>> 32));
            Iiiilllliiilll.method_1562().method_52787(new class_2846(class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
            return true;
         }
      } else {
         return false;
      }
   }

   private static String Illillllil(class_1799 stack) {
      return stack != null && !stack.method_7960()
         ? stack.method_7909().toString() + IliIlllilIi<"IliIlllilIi","xGwvhDUlkEcXT1o+iALho0Ev/Y4S20AQLl/CSak=">() + stack.method_7947()
         : IliIlllilIi<"IliIlllilIi","dFtKA7M/coN7RlSsHwxfMmtA3n4iioagcgIChsxVueZa">();
   }

   private static String iliIiIiiIi(int invSlot) {
      return invSlot == (-(~-535071260 ^ 55 ^ 25) ^ -535071261)
         ? IliIlllilIi<"IliIlllilIi","oFXJPdgMD8PVdi+JKvrnNQX2GHaw74E2noXZIfiJtGk2u4xu">()
         : (
            invSlot < (-1090190944 * -1205604855 - -107 ^ -1752183038)
               ? IliIlllilIi<"IliIlllilIi","xr88wYODPp5f2deuJKRbzUmOLQwKvd1joqaU9OsHxft2nHY=">() + (invSlot + 1)
               : IliIlllilIi<"IliIlllilIi","UCV3fkumvVTPEA1+VRO0fWyjGhUOBgpdghFhGnMRPRI=">() + invSlot
         );
   }

   public void IiIilliIil(IliIliIllliIliIl event) {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.IiIIlliIIl(event);
      }
   }

   private boolean illilIilil(int button, int now, long sourceSlot) {
      long var11 = 3622778434107295880L;
      long var13 = 6501741440429969016L;
      long var15 = -6572881088160351870L;
      if (this.lIIIiIlIIi != null) {
         return false;
      } else if (lIlIiIliIlIiIl.Illlllllilll() && now != ((-(--1554046846) << 21 | -(--1554046846) >>> 11) ^ 273968076)) {
         return false;
      } else if (this.IiIliliIli(sourceSlot)) {
         return false;
      } else {
         var11 ^= ((long)this.lililiilil() << 32 ^ var11) & -1L << 32;
         if ((int)(var11 >>> 32) != 0 && !this.IIiillIiil()) {
            return false;
         } else {
            var11 ^= ((long)(this.iIIilIlIIi.Iilllilliill() && !this.lIIilIlIIi.Iilllilliill() && !liiIIiIiiiiIIiIi.iIlllIllll() ? 1 : 0) ^ var11) & -1L >>> 32;
            var13 ^= ((long)Iiiilllliiilll.field_1724.field_7498.field_7763 << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)iIiliIlili(button) ^ var13) & -1L >>> 32;
            var15 ^= (
                  (long)(
                           now
                                 == (
                                    ~(((-1107953513 << 13 | -1107953513 >>> 19) ^ -87) << 5 | ((-1107953513 << 13 | -1107953513 >>> 19) ^ -87) >>> 27)
                                       ^ -497091265
                                 )
                              ? -(~-1958877341) ^ -91 ^ 1958877417
                              : now
                        )
                        << 32
                     ^ var15
               )
               & -1L << 32;
            this.iIiilIlIIi = sourceSlot + this.iiIliIIlli();
            this.liiIiIlIIi = (int)(var15 >>> 32);
            Runnable var10 = () -> {
               long var9 = 2560496525238906614L;
               if (this.IliIlllilIi() || iIIliIlIIi != null) {
                  if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.method_5805()) {
                     if (Iiiilllliiilll.field_1724.field_7512 == Iiiilllliiilll.field_1724.field_7498) {
                        if (Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
                           if (this.lIIIiIlIIi == null) {
                              if (!this.IiIliliIli(System.currentTimeMillis())) {
                                 if (!Iiiilllliiilll.field_1724.method_31548().method_5438(syncId).method_31574(class_1802.field_8288)) {
                                    if (Iiiilllliiilll.field_1724.method_31548().method_5438(button).method_31574(class_1802.field_8288)) {
                                       if (!sourceSlotx || Iiiilllliiilll.field_1755 instanceof class_490) {
                                          var9 ^= ((long)lIlillliIlilll.IilliliilIIi(this) << 32 ^ var9) & -1L << 32;
                                          if ((int)(var9 >>> 32) != 0 || lIlillliIlilll.IliIlllilIi(this)) {
                                             try {
                                                this.IlIIillIIi(buttonx, fromHandlerSlot, now);
                                             } finally {
                                                if ((int)(var9 >>> 32) == 0) {
                                                   lIlillliIlilll.liiiIIllIl(this);
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            };
            this.iiiIiIlIIi = var10;
            lIlIiIliIlIiIl.iIlIlllllill(var10, (boolean)((int)var11));
            return true;
         }
      }
   }

   static boolean IIIillIIil(float ehp, float peak) {
      return ehp <= peak - 1.0F;
   }

   private static int liiIiiiiIi(int handlerSlot) {
      return handlerSlot >= (((1151585516 ^ 1) >>> 5 | (1151585516 ^ 1) << 27) - 23 ^ 1780817524) && handlerSlot <= (-1893200677 + -57 ^ 59 ^ -1893200715)
         ? handlerSlot - (-(--620546157) ^ -620546121)
         : (
            handlerSlot == ((-(--1968504129) + 41 << 7 | -(--1968504129) + 41 >>> 25) ^ 1434547304)
               ? ~(~2046002758 >>> 31 | ~2046002758 << 1) + 117 ^ -202961623
               : handlerSlot
         );
   }

   private void ilIIiIiIIi(int fromHandlerSlot, int kind, int button, String syncId) {
      class_1703 var5 = Iiiilllliiilll.field_1724.field_7512;
      if (fromHandlerSlot == var5.field_7763 && Iiiilllliiilll.method_1562() != null) {
         int var6 = liiIiiiiIi(kind);
         int var7 = button == 40 ? 40 : button;
         int var8 = lIliliIlil(var7);
         class_1661 var9 = Iiiilllliiilll.field_1724.method_31548();
         class_1799 var10 = var9.method_5438(var6).method_7972();
         class_1799 var11 = var9.method_5438(var7).method_7972();
         int var12 = ilIIiIlIIi.get(kind);
         int var13 = ilIIiIlIIi.get(var8);
         ArrayList var14 = new ArrayList(var5.field_7761.size());

         for (class_1735 var16 : var5.field_7761) {
            var14.add(var16.method_7677().method_7972());
         }

         var5.method_7593(kind, button, class_1713.field_7791, Iiiilllliiilll.field_1724);
         class_10937 var19 = Iiiilllliiilll.method_1562().method_68823();
         Int2ObjectOpenHashMap var20 = new Int2ObjectOpenHashMap();

         for (int var17 = 0; var17 < var14.size(); var17++) {
            class_1799 var18 = ((class_1735)var5.field_7761.get(var17)).method_7677();
            if (!class_1799.method_7973((class_1799)var14.get(var17), var18)) {
               var20.put(var17, class_10938.method_68853(var18, var19));
            }
         }

         var20.put(kind, class_10938.method_68853((class_1799)var14.get(kind), var19));
         Iiiilllliiilll.method_1562()
            .method_52787(
               new class_2813(
                  fromHandlerSlot,
                  var5.method_37421(),
                  (short)kind,
                  (byte)button,
                  class_1713.field_7791,
                  var20,
                  class_10938.method_68853(var5.method_34255(), var19)
               )
            );
         this.lIIIiIlIIi = new IIlllilIllli(System.currentTimeMillis(), syncId, var6, var7, kind, var8, var10, var11, var12, var13, llIIiIlIIi);
         this.iIlIiIlIIi = this.lIIIiIlIIi.IliIlllilIi();
         iIIIiIlIIi = var6;
         IlIIiIlIIi = var7;
         if (var7 == 40) {
            this.iililIlIIi = true;
            this.IIiilIlIIi = this.lIIIiIlIIi.IliIlllilIi();
         }
      }
   }

   static int Ilillllill(boolean reserveGate, BooleanSupplier leased, BooleanSupplier restockGate) {
      if (reserveGate && leased != null && !leased.getAsBoolean()) {
         return restockGate != null && restockGate.getAsBoolean() ? 1 : 0;
      } else {
         return 2;
      }
   }

   private void Illlilllli(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }
   }

   static int ilillIiill(boolean urgent, boolean noHotbar, boolean rapid) {
      if (!urgent && !noHotbar) {
         return rapid ? 1 : 2;
      } else {
         return 0;
      }
   }

   public static synchronized void lllllillll(Object owner) {
      if (owner != null && iIIliIlIIi == owner) {
         iIIliIlIIi = null;
         IlIliIlIIi = null;
         llIliIlIIi = null;
         if (llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class) instanceof IIIIilIilIIIilIi var1 && !var1.IliIlllilIi()) {
            lIlIiIliIlIiIl.Iiilliiliiil(var1.iiiIiIlIIi);
            var1.iiIilIIlil();
            lIlillliIlilll.liiiIIllIl(var1);
         }
      }
   }

   @Override
   public void Illillliilli() {
      this.iiIilIIlil();
   }

   private boolean llIliilIli() {
      if (!this.IllilIlIIi) {
         return false;
      } else {
         this.IllilIlIIi = false;
         this.IliilIlIIi.iIlIlllllill(this.iiIilIlIIi - this.IIlilIlIIi);
         return true;
      }
   }

   public static void iilllIIill(Object ticks, int owner) {
      if (Iillllilll(ticks)) {
         if (llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class) instanceof IIIIilIilIIIilIi var2) {
            var2.lililIlIIi = var2.iiIilIlIIi + Math.max(0, owner);
         }
      }
   }

   private int IIIlilIIli() {
      return !this.IiillIlIIi.Iilllilliill() ? 1 : Math.max(1, (this.liillIlIIi.Iilllilliill() + 49) / 50);
   }

   private static IIIIilIilIIIilIi liIlliiIll() {
      if (llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class) instanceof IIIIilIilIIIilIi var0 && (var0.IliIlllilIi() || iIIliIlIIi != null)) {
         return var0;
      }

      return null;
   }

   private void iiiilIIIIi() {
      IiIlIillliIlIill var1 = this.iilIiIlIIi;
      this.lIIIiiIIIi();
      if (var1 != null
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1755 == var1
         && Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
         Iiiilllliiilll.field_1724.method_7346();
      }
   }

   private long iiIliIIlli() {
      return (long)this.IIIilIlIIi.Iilllilliill() * (3068753110374931836L ^ 3068753110374931790L);
   }

   private int IIililIili() {
      return this.ilillIlIIi.Iilllilliill() - 1;
   }

   @Override
   public void Iilililiiili() {
      if (iIIliIlIIi == null) {
         lIlIiIliIlIiIl.Iiilliiliiil(this.iiiIiIlIIi);
      }

      this.iiIilIIlil();
      this.iiiilIIIIi();
      lIlillliIlilll.liiiIIllIl(this);
   }

   private void lIiIiiIiIi() {
      if (this.IIlIiIlIIi == (~(-2072366011 * -755159085 ^ -37) ^ -494747654)
         && this.lllIiIlIIi >= 0
         && this.lllIiIlIIi != this.illIiIlIIi
         && Iiiilllliiilll.field_1724 != null) {
         IIiIIIlilIiIIIli.IliIlllilIi(this.lllIiIlIIi);
      }

      this.IIlIiIlIIi = 0;
      IilIiIlIIi = false;
      this.lllIiIlIIi = -1;
      this.illIiIlIIi = -1;
   }

   private void iilIiIIiIi(long now, boolean ok) {
      long var5 = -3014735076672664051L;
      this.lIiIiiIiIi();
      if (ok) {
         this.iIiilIlIIi = now + this.iiIliIIlli();
      } else {
         var5 ^= ((long)this.lilliiilli() << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) != ((~-716517931 >>> 13 | ~-716517931 << 19) ^ 1856940630)
            && !Iiiilllliiilll.field_1724
               .method_31548()
               .method_5438(~((-61749902 << 13 | -61749902 >>> 19) * -1857283155) ^ -954343019)
               .method_31574(class_1802.field_8288)) {
            this.illilIilil((int)(var5 >>> 32), ((~-1278473311 >>> 13 | ~-1278473311 << 19) + 21) * 125 ^ -1873169204, now);
         }
      }
   }

   private int iIIliIlIli() {
      return !this.IiillIlIIi.Iilllilliill() ? 1 : Math.max(this.IIIlilIIli() + 4 - 1, (this.iiillIlIIi.Iilllilliill() + 25) / 50);
   }

   private boolean lililiilil() {
      return this.IlillIlIIi.Iilllilliill() && iIIliIlIIi == null && Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1724.method_56992();
   }

   public static int IlIllllIll() {
      long var2 = -4525764448527474977L;
      IIIIilIilIIIilIi var0 = liIlliiIll();
      if (var0 != null && var0.llillIlIIi.Iilllilliill()) {
         var2 ^= ((long)var0.IIililIili() << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < ((1776707750 - 45 ^ -77) + -71 + 91 ^ -1776707625) ? (int)(var2 >>> 32) : -1;
      } else {
         return -1;
      }
   }

   private void lliililiil() {
      if (this.iilIiIlIIi != null) {
         if (this.lIIIiIlIIi == null && !lIlIiIliIlIiIl.Illlllllilll() && !this.Iiiilliiil()) {
            if (this.iIiIiIlIIi < 0) {
               this.iIiIiIlIIi = this.iiIilIlIIi + 1 + this.IiIilIlIIi.nextInt(3);
            } else if (this.iiIilIlIIi >= this.iIiIiIlIIi) {
               this.iiiilIIIIi();
            }
         } else {
            this.iIiIiIlIIi = -1;
         }
      }
   }

   private void IilIililIi(long now) {
      if (this.IIlIiIlIIi == 1) {
         if (this.lllIiIlIIi >= 0 && this.lllIiIlIIi != this.illIiIlIIi) {
            IIiIIIlilIiIIIli.IliIlllilIi(this.lllIiIlIIi);
         }

         IilIiIlIIi = false;
         this.IIlIiIlIIi = 2;
      }

      if (Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288)) {
         this.iilIiIIiIi(now, true);
      } else if (now - this.lIlIiIlIIi > 600L) {
         this.iilIiIIiIi(now, false);
      }
   }

   public static boolean Iillllilll(Object owner) {
      return owner != null && iIIliIlIIi == owner;
   }

   public void iIIilIlIil() {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.iIIIlIlIIl();
      }
   }

   private boolean IIiillIiil() {
      if (this.iilIiIlIIi == null) {
         if (Iiiilllliiilll.field_1755 instanceof class_490) {
            return true;
         } else {
            this.iIiilIliil(false);
            return false;
         }
      } else {
         return Iiiilllliiilll.field_1755 == this.iilIiIlIIi && this.iiIilIlIIi >= this.lIiIiIlIIi;
      }
   }

   private boolean IiIliliIli(long now) {
      if (Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1724.method_7325()) {
         long var3 = this.IiiilIlIIi;
         long var5 = this.liiilIlIIi;
         return var3 > (-1773656945429253553L ^ -1773656945429253553L) && now - var3 < (7976372080919229004L ^ 7976372080919230352L)
            || var5 > (3033161687276331686L ^ 3033161687276331686L) && now - var5 < (-5616102385177538734L ^ -5616102385177538648L);
      } else {
         return true;
      }
   }

   boolean lIilliIill() {
      return iIIliIlIIi != null
         && this.lililIlIIi != (~((-517141629 << 9 | -517141629 >>> 23) >>> 7 | (-517141629 << 9 | -517141629 >>> 23) << 25) ^ -78917136)
         && this.iiIilIlIIi <= this.lililIlIIi;
   }

   public static synchronized boolean iIlllIllll(Object owner, BooleanSupplier restockGate, BooleanSupplier reserveGate) {
      if (owner == null) {
         return false;
      } else if (llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class) instanceof IIIIilIilIIIilIi var3) {
         if (ilIIlilIiIIlil.lIiiIiIlilli(var3)) {
            return false;
         } else {
            Object var5 = iIIliIlIIi;
            if (var5 != null && var5 != owner) {
               return false;
            } else {
               IlIliIlIIi = restockGate;
               llIliIlIIi = reserveGate;
               if (var5 == null) {
                  if (!var3.IliIlllilIi()) {
                     var3.iiIilIIlil();
                  }

                  iIIliIlIIi = owner;
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   private void iIlIiIllIi() {
      this.lIIIiIlIIi = null;
      iIIIiIlIIi = -1;
      IlIIiIlIIi = -1;
   }

   @Override
   public void iIIIlIlIIl() {
      this.iiIilIlIIi++;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (this.iilIiIlIIi != null && Iiiilllliiilll.field_1755 != this.iilIiIlIIi) {
            this.lIIIiiIIIi();
         }

         if (this.iilIiIlIIi != null && this.iiIilIlIIi - this.IIiIiIlIIi > 40) {
            this.IliIiIlIIi = this.iiIilIlIIi + 10;
            this.iiiilIIIIi();
         }

         if (Iiiilllliiilll.field_1724.field_7512 == Iiiilllliiilll.field_1724.field_7498 && Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
            long var1 = System.currentTimeMillis();
            if (Iiiilllliiilll.field_1724.method_5805() && !(Iiiilllliiilll.field_1755 instanceof class_418)) {
               if (this.iiiilIlIIi) {
                  this.iiiilIlIIi = false;
                  this.IiiilIlIIi = var1;
               }

               for (int var3 = 0; var3 < 9; var3++) {
                  class_1799 var4 = Iiiilllliiilll.field_1724.method_31548().method_5438(var3);
                  if (var4.method_31574(class_1802.field_8288)) {
                     this.lIIliIlIIi[var3] = true;
                  } else if (!var4.method_7960()) {
                     this.lIIliIlIIi[var3] = false;
                  }
               }

               this.liIIiiiIIi(var1);
               if (!lIlIiIliIlIiIl.Illlllllilll()) {
                  this.liiIiIlIIi = -1;
               }

               this.lliililiil();
               if (this.IIlIiIlIIi != 0) {
                  this.IilIililIi(var1);
               } else {
                  boolean var9 = Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288);
                  boolean var10 = this.lllilIlIIi;
                  this.lllilIlIIi = var9;
                  if (var9) {
                     this.liIilIlIIi = false;
                     this.iililIlIIi = false;
                  } else if ((!this.iililIlIIi || var1 - this.IIiilIlIIi >= 400L) && this.liiIiIlIIi != 40) {
                     this.iililIlIIi = false;
                     if (this.liIilIlIIi) {
                        if (this.llIilIlIIi.Iilllilliill() && this.lIilliIill() && this.lIlilIlIIi > this.iiIilIlIIi) {
                           this.lIlilIlIIi = liilliiill(this.lIlilIlIIi, this.IIlilIlIIi, this.iiIilIlIIi, this.IliilIlIIi.liiiIIllIl());
                        }
                     } else {
                        this.liIilIlIIi = true;
                        boolean var5 = this.llIilIlIIi.Iilllilliill() && this.illilIlIIi > 0L && var1 - this.illilIlIIi < 600L;
                        boolean var6 = this.llIilIlIIi.Iilllilliill() && this.lIilliIill();
                        boolean var7 = this.ilIilIlIIi.Iilllilliill() && !this.lililiilil() && this.IliIilliIi() == -1;
                        this.illilIlIIi = var1;
                        this.IIlilIlIIi = this.iiIilIlIIi;
                        this.iIlilIlIIi = var10 && !Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8288);
                        this.IllilIlIIi = this.iIlilIlIIi;
                        this.IililIlIIi = Iiiilllliiilll.field_1724.method_6032() + Iiiilllliiilll.field_1724.method_6067();
                        int var8 = ilillIiill(var5, var6, var7);
                        if (var8 == 0) {
                           this.lIlilIlIIi = this.iiIilIlIIi + this.IliilIlIIi.liiiIIllIl();
                        } else if (var8 == 1) {
                           this.lIlilIlIIi = this.iiIilIlIIi;
                        } else {
                           this.lIlilIlIIi = this.iiIilIlIIi + this.IliilIlIIi.IliIlllilIi(this.IIIlilIIli(), this.iIIliIlIli());
                        }

                        if (this.lililiilil() && this.lilliiilli() != -1) {
                           this.iIiilIliil(var8 == 0);
                        }
                     }

                     if (this.iiIilIlIIi >= this.lIlilIlIIi || this.lIlliiIlli()) {
                        boolean var11 = this.ilIilIlIIi.Iilllilliill() && !this.lililiilil();
                        if (var11 && this.IliIilliIi() != -1 && this.iIlIiIlIIi > 0L && var1 - this.iIlIiIlIIi < 150L) {
                           return;
                        }

                        if (var11 && this.lllIiillIi(var1)) {
                           this.llIliilIli();
                           this.liIilIlIIi = false;
                           return;
                        }

                        int var13 = this.lilliiilli();
                        if (var13 != -1 && this.illilIilil(var13, 40, var1)) {
                           this.liIilIlIIi = false;
                           return;
                        }
                     }
                  }

                  int var12 = Ilillllill(iIIliIlIIi != null, IlIliIlIIi, llIliIlIIi);
                  if (var12 != 0) {
                     if (var1 >= this.iIiilIlIIi) {
                        if (this.llillIlIIi.Iilllilliill()) {
                           int var14 = this.IIililIili();
                           if (!Iiiilllliiilll.field_1724.method_31548().method_5438(var14).method_31574(class_1802.field_8288)) {
                              int var15 = this.illliIilli();
                              if (var15 != -1) {
                                 this.illilIilil(var15, var14, var1);
                                 return;
                              }
                           }

                           if (var12 != 2) {
                              return;
                           }

                           for (int var16 = 0; var16 < 9; var16++) {
                              if (var16 != var14 && this.lIIliIlIIi[var16] && Iiiilllliiilll.field_1724.method_31548().method_5438(var16).method_7960()) {
                                 int var17 = this.illliIilli();
                                 if (var17 != -1) {
                                    this.illilIilil(var17, var16, var1);
                                    return;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               this.iIlIiIllIi();
               this.iiiilIIIIi();
               if (this.IIlIiIlIIi != 0) {
                  this.lIiIiiIiIi();
               }

               this.liIilIlIIi = false;
               this.iililIlIIi = false;
               this.IllilIlIIi = false;
               this.lllilIlIIi = false;
               this.iiiilIlIIi = true;
            }
         }
      } else {
         this.liIilIlIIi = false;
         this.iilIiIlIIi = null;
         this.iIiIiIlIIi = -1;
         lIlillliIlilll.liiiIIllIl(this);
      }
   }

   private void IIlIilIlIi(long now, IIlllilIllli why, String p) {
      this.iililIlIIi = false;
      this.iIiilIlIIi = Math.max(this.iIiilIlIIi, now + (-4782576121354836938L ^ -4782576121354836832L));
   }

   public void llIililIil(IiIiIlIiliIiIlIi event) {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.llIIlilIIl(event);
      }
   }

   private boolean lIlliiIlli() {
      if (this.llIilIlIIi.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         float var1 = Iiiilllliiilll.field_1724.method_6032() + Iiiilllliiilll.field_1724.method_6067();
         if (var1 > this.IililIlIIi) {
            this.IililIlIIi = var1;
            return false;
         } else {
            return IIIillIIil(var1, this.IililIlIIi);
         }
      } else {
         return false;
      }
   }

   @Override
   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      if (event.iilIIiiIll instanceof class_2649 var2) {
         if (var2.comp_3837() == 0) {
            llIIiIlIIi++;
            if (IlIIiIlIIi == -1) {
               this.liiilIlIIi = System.currentTimeMillis();
            }
         }
      } else if (event.iilIIiiIll instanceof class_2724) {
         this.IiiilIlIIi = System.currentTimeMillis();
      } else if (event.iilIIiiIll instanceof class_2653 var3) {
         int var9 = var3.method_11450();
         if (var3.method_11452() == 0) {
            if (var9 >= 0 && var9 < 46) {
               ilIIiIlIIi.incrementAndGet(var9);
            }

            String var6 = var9 == 45
               ? IliIlllilIi<"IliIlllilIi","oFXJPdgMD8PVdi+JKvrnNQX2GHaw74E2noXZIfiJtGk2u4xu">()
               : (
                  var9 >= 36 && var9 <= 44
                     ? IliIlllilIi<"IliIlllilIi","xr88wYODPp5f2deuJKRbzUmOLQwKvd1joqaU9OsHxft2nHY=">() + (var9 - 35)
                     : IliIlllilIi<"IliIlllilIi","UCV3fkumvVTPEA1+VRO0fWyjGhUOBgpdghFhGnMRPRI=">() + var9
               );
            IiIIiIlIIi = IliIlllilIi<"IliIlllilIi","8YvvJEQcxBR5DSvoYSzu50bEPNcLxRGnWeimsKVbxN4Ocb4+">()
               + var6
               + IliIlllilIi<"IliIlllilIi","kbHJJZ+9dH20kPF2sP5ESIDJvphcg/sIMEPPCLw=">()
               + Illillllil(var3.method_11449())
               + IliIlllilIi<"IliIlllilIi","j2yMbDUiBhVLBgIK+g/sbXRdGJlK6fzvKFOnXQ8=">();
         } else if (var3.method_11452() == -2) {
            int var12 = lIliliIlil(var9);
            if (var12 >= 0 && var12 < 46) {
               ilIIiIlIIi.incrementAndGet(var12);
            }

            String var7 = var9 == 40
               ? IliIlllilIi<"IliIlllilIi","oFXJPdgMD8PVdi+JKvrnNQX2GHaw74E2noXZIfiJtGk2u4xu">()
               : (
                  var9 < 9
                     ? IliIlllilIi<"IliIlllilIi","xr88wYODPp5f2deuJKRbzUmOLQwKvd1joqaU9OsHxft2nHY=">() + (var9 + 1)
                     : IliIlllilIi<"IliIlllilIi","UCV3fkumvVTPEA1+VRO0fWyjGhUOBgpdghFhGnMRPRI=">() + var9
               );
            IiIIiIlIIi = IliIlllilIi<"IliIlllilIi","G8FhNDYmNK74h7UuX0ti3kyqo97Ea2s8cyiRSLxmAL//InMk3W4y2g==">()
               + var7
               + IliIlllilIi<"IliIlllilIi","kbHJJZ+9dH20kPF2sP5ESIDJvphcg/sIMEPPCLw=">()
               + Illillllil(var3.method_11449())
               + IliIlllilIi<"IliIlllilIi","j2yMbDUiBhVLBgIK+g/sbXRdGJlK6fzvKFOnXQ8=">();
         }
      } else if (event.iilIIiiIll instanceof class_9835 var4) {
         int var11 = var4.comp_2891();
         int var13 = lIliliIlil(var11);
         if (var13 >= 0 && var13 < 46) {
            ilIIiIlIIi.incrementAndGet(var13);
         }

         if (var11 == 40 || var11 < 9) {
            IiIIiIlIIi = IliIlllilIi<"IliIlllilIi","Sxi71Xb2X8218zgjyQ2HqyPNLMGy7cS4nLowYYgHxzPu6uEIP+LRNMyEi0lY+bE=">()
               + (
                  var11 == 40
                     ? IliIlllilIi<"IliIlllilIi","oFXJPdgMD8PVdi+JKvrnNQX2GHaw74E2noXZIfiJtGk2u4xu">()
                     : IliIlllilIi<"IliIlllilIi","xr88wYODPp5f2deuJKRbzUmOLQwKvd1joqaU9OsHxft2nHY=">() + (var11 + 1)
               )
               + IliIlllilIi<"IliIlllilIi","kbHJJZ+9dH20kPF2sP5ESIDJvphcg/sIMEPPCLw=">()
               + Illillllil(var4.comp_2892())
               + IliIlllilIi<"IliIlllilIi","j2yMbDUiBhVLBgIK+g/sbXRdGJlK6fzvKFOnXQ8=">();
         }
      }
   }

   private static int lIliliIlil(int invSlot) {
      if (invSlot >= 0 && invSlot < (1570173636 * 5 + -107 ^ -739066528)) {
         return (-(~(2082846842 << 11 | 2082846842 >>> 21) ^ -5) ^ -767808449) + invSlot;
      } else {
         return invSlot == (~(1104897534 >>> 3 | 1104897534 << 29) ^ 935629672) ? (-605130655 - -9 ^ -67) * 128207979 * 41 ^ -270736056 : invSlot;
      }
   }

   private int lilliiilli() {
      int var1 = this.illliIilli();
      if (var1 != -1) {
         return var1;
      } else {
         class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
         int var3 = this.IIililIili();

         for (int var4 = 0; var4 < 9; var4++) {
            if (var4 != var3 && var2.method_5438(var4).method_31574(class_1802.field_8288) && !iiiIlIIIll(var4)) {
               return var4;
            }
         }

         return var2.method_5438(var3).method_31574(class_1802.field_8288) && !iiiIlIIIll(var3) ? var3 : -1;
      }
   }

   private static int iIiliIlili(int inventorySlot) {
      return inventorySlot < (-((189740631 - 23 << 17 | 189740631 - 23 >>> 15) >>> 25 | (189740631 - 23 << 17 | 189740631 - 23 >>> 15) << 7) ^ -1074483005)
         ? (557057184 * 119 * 25 ^ -612253884) + inventorySlot
         : inventorySlot;
   }

   private void lIIIiiIIIi() {
      this.iilIiIlIIi = null;
      this.iIiIiIlIIi = -1;
      lIlillliIlilll.liiiIIllIl(this);
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      long var5 = 7433384641850689053L;
      if (Iiiilllliiilll.field_1724 != null) {
         byte var10000;
         label39: {
            class_2596 var2 = event.lIiilIIIIi;
            label28:
            if (!(var2 instanceof class_2824) && !(var2 instanceof class_2885) && !(var2 instanceof class_2886)) {
               if (var2 instanceof class_2846 var4 && var4.method_12363() != class_2847.field_12969) {
                  break label28;
               }

               var10000 = 0;
               break label39;
            }

            var10000 = 1;
         }

         var5 ^= ((long)var10000 << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) != 0) {
            this.IiiIiIlIIi = Iiiilllliiilll.field_1724.field_6012;
         }
      }
   }

   private int illliIilli() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for (int var2 = 9; var2 < 36; var2++) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8288)) {
            return var2;
         }
      }

      return -1;
   }

   public IIIIilIilIIIilIi() {
      super(IliIlllilIi<"IliIlllilIi","8hDFGWoQ+jyZtwih11/O0kAwgSXrWDunv42m8cl3oAGm96AC260UlcW8wrv19bzG">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.llillIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","dYxZ38NxotBfl99dxXG7SVnmWOs9iCsWfWvYaCCOQZ7sEYoMx3G02g==">(),
         IliIlllilIi<"IliIlllilIi","32xQ5+lz4/HtjZxOijFVXPY//IsdrhskVGOxqCPFPQsnFSnHGfKS6JNfIy2GJ2Y6YpE1MM/Kn0iOP52OFFDQ5gsART5jegdgQWmVbcp1BsD0E2fa4zAp2MpSKmnn4Nymobab5qdXNkvcZMaBDF449jw/HvXb8zmwkhEXc906+k8n3AgQBdfsnoQ9Sh8TIrF0HMqwpfAmMZKdvOMpV/Rio9RAZMSlLHPNCPiljg54+7YTtnnIzks4jnu2bccXa8rT3kUz0oQqDIGR+lIsnEra0aD6ZdIH5gJ8QDNaBwo=">(),
         true
      );
      this.ilillIlIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","DAVhkFixKr8FyaYPAJnqBWN+X8b8Dkqnj1RjXJ8WGYc6ru6j9CA=">(),
         IliIlllilIi<"IliIlllilIi","pVrTsuyRQ1Ez/7vOjOdVD7DC2APtQd803PCY7lIoyV3Q5k2lK6yPP4nkgOSUc/vrysWwDhTrIw7yOwOXHqxcNxZm3fhqOJp931QwE9M/nlwV8qsuJUzbxSFR6qJ3Bjzk51uYcQkW3tEfDx3bBOxd0UBHQSXvS136aYnr4/pNPyoGexh5MQOWqtC1pYx7gZSpfqWKwWi1h9/3bdIHH4+ySNA=">(),
         9,
         1,
         9
      );
      this.IiillIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","4CLD0ZOd0w9vh3nw0r7o9nAHInmd6vScVE6h2FJ/GeJ6tL9p">(),
         IliIlllilIi<"IliIlllilIi","B7Q8KOyA60MZ4EBFqUG81E3daRRWCNweKJzdsJfVLua6d96qu9aox7p9hmTu7Xr/8qzgteI/zOFIilS/IV5FE9Jr37XPuTfwdkLEMPRea8BIOFRcCBdwng/CI2oHnQThpDy5tK5mWpA7yHcknPRZDHXy7k0HZvVhiVT+VA2nAFKEg1hiX4ynpXJ9zvTdj8iztTEsZuqjkPQSK/DDgZUOfBdgcSifuaW0D9xOp6uzKUgf7yE1OTwBOKjqDgGjv6jT1nmYvp0u/oO3zOX4eQZj4Qb/OEl5VbiGNQbi2Cfxr8/W8jHtHgPL9jEds/N/BpEfcYyuuL7JxnKWgqBDJPiyooywu9wIW9TmvbVn">(),
         true
      );
      this.liillIlIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","nPgVRm5dxHKiw+MwRB6y+DX13M9AafBBqJf4fX4/B3Iq0WJtmqyuqw==">(),
         IliIlllilIi<"IliIlllilIi","NeTQeQl8JBfC0osoE6ZyL6SM0IkpUQz2wGc1LHe91sTD8BQCpfAae6mMOTyq8ueuz4jWdEpGzDxnluP4ND9DFvsLO8POFuSxLs/udEG3Zjr6rwzgNl4cXt/RRxb3NQCOe+SkvE2l88Xt1UXmiB0Y7QsPh9fO9ImYj2nh5Uw0bF3MAvbUIrMH/6fjLXauIOmNfOUy/oYyoD4qlAyQ6XK6AING/5Ip4bg3ywxWf9xJogeBkuuEDvDVuHkaCG9yX6e9SAFoVbvAIYr7xPDQ+pwGOA==">(),
         45,
         20,
         500
      );
      this.iiillIlIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","1+jYG4c7oMVp3g2d/qpdoQrlOyCpTxyo9rLGHrBu6Dus+zGO3Gw/8g==">(),
         IliIlllilIi<"IliIlllilIi","I/Io8NR0Fsp1EWXNZEfuao766h9pDd23cqQJ/YyAHqDZG9TYvRaLdFVioFWaHA6V2vm64e2UdmqOasIt+ZLlm1M60y0fdoYQtkCOlqZYoxkD1yflxg/0fzy05ht3f7cWNa1wjb8uvGBfKypbFBXPlbwtXAsaaFHFFgMeuyJ4Kjgx1IAEoDG5/oba4Hgdu3720Mj0uXbk23xVdXhkc8qpNNxLl6LnMn2BOEoBaASlFs4yRgK5SM5sj78tzV4Zq68TQj0vOx6q3ohCEb9SzqoDDdhPpcuMdm6NsgJvzhKHQK4wPTN/ruL9+eNfOKTOt3sE7SFHZ0FhUAELAx+S7jpXJcMW28R/YmIHSBg+9Lvmu1hPzaRMoKtb7QWVal+AZBdx2wQC4GM5wyexccQ9XUagT8d/uIZZiIdV6Zp+EpzV+KasqW3ackV95/9uXQI=">()
            + IliIlllilIi<"IliIlllilIi","vBoaDl4vDqQOgW/8tX0pq2rX70Ayq+I82LUZZ/7wqQ6H33ZNmVH/GABkkX3Ac8HedGMGmrp95NEinIStTWdO79a2MeaGkJDaGZnMfyr87Ttt6driO1ytKFMVsHSAQRzxob0J6Y1e2Jo4CxgfRP6VAPyztG1oj2/uY9H4tF/kSN0GgKptIzrlduXTEY5Zg3l0uMzpDUWefFps25jgeqLdD5KUgv95IzIV4LsQ8uaOQrWMDLzyoXuL4TP5DYy0QaKz+YGJBCo1rysljrAFFIJd7mANWcvF1lz3RHOnONq+pxaiYcv+ujN8tpLYdedffuqVIKnCPLfSIX6gpJrKURru27OI54vmmVb2rbbFjH00fp9m52lJ28xl+nxFGDWLHg0Kw+o66Cfuju04znXDhk4zEgVwwWho3MH3N7W9IQE2EPJBmOA9OVIt70h7Q8ZxCLFDx9eCXWx0YBT4oYQude45qIGhXX9HGOcDSlzqj44pT3SkmF+c8xw=">(),
         300,
         60,
         900
      );
      this.IIIilIlIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","hXvkiCwlFU3OJt25E04fWFmg+VE+fWI50WG/LC+VnzxBN0ICmg3frw==">(),
         IliIlllilIi<"IliIlllilIi","jDKkejaOyJXry2S3Y1NXHiCZAmewHFAHjjkyYDvT8JSZyoKRVs/pybUB74J0JGGoNwnjE8lpj6KZPAuMUr4FuLtHtBZboGG0Cn3aWLdXAY//TWfqROfOJhU5r1roxwsliW3ePtuV0BTfMyOlyTLbdJgQ6z2DIQFsd0iQoim3ebdZsIri55L4wAH4wblNk+2xG+PQYQTe9ugZvrEE49l6UGj47FP2JgYmN5BFbfBPSbR56OiYybxtc4S+4LUvf6w2OnGyVMxF5B9jhwwAtWP8ZvdzIfKZln69gQ==">(),
         1,
         0,
         10
      );
      this.lIIilIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","iT9tw/ZX53n+TpMGS5aeezHznzPSmDZ0Xm/m9+GY0ZbObcmZ++Kf/aQZ89GctT3feQ==">(),
         IliIlllilIi<"IliIlllilIi","1QHhwhgF5o69pGahhsmw5CohHOvVzNw6MS6c6utbKNGoaa2Sh1PAiI5DKfYseDgFFCKsM7icYOrLKKbC1CoMvwRr4F/G4xUu71bX4CtBh86I/cMXZ2TZ+zFVu7Tgc8qauDH3dZbLGagNrjdcUmJDEteucs0UO5Eo/iaZYw29kyTtddZoVqenOa5TJlJGfGcTuzFYaYBbDc43JeHRI7l5cxL80tz/xFUihMJ18MIetBLOimIa3N3HfZZzg2Y4FO/K/k20oYSsjvFUPrUWZIFocMBojrAwbwCTBdatg/Udboc+jC+D+OuGRGC+DMKXfztE+YsstlRIuPNEuT1sKObP3I1CJIyrt7fZ7wyQ46MkD1OoppZyM0hqzRcIEVFAeEDQKIRj5y4dsfm8tqYRgotCHpfx05N0jg7KjcKjfZR0gXGS+v0fmqf/jF+q2Iik6xAJulq0pfWBKYjEC4PZYhrZedl9YVtmVLZlsXEE2tfaeoxzmzLpTtLRjEG9erNRzKl6kBaaTkNWzQ9uEowVOs1P6u3Kq8fBA9gV/ELB2Uj/2hE=">(),
         false
      );
      this.iIIilIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","CWxUL/59IpE8pTi03Bs8VKOF0mdKIduKwxlSNbThVZhBlSCPyN9u">(),
         IliIlllilIi<"IliIlllilIi","+0/0V+oECg21mqjNlusgRq7l7/+uSFe8+Kt+Yr+CHVIOkR4MN6Yenu34zXUIff8tQ0p+gUN6fYT3OfFFbGWNFOaQJ7aBvLYTHWVbNS6kMPkBpIDMOs+yEnT4uzpxh8YViteedvUYnqDs9HOlMRMo5fRv6LlPjUVPzShKAFisBO3Iy8XEAnlRf5F/J1VmFh7zG0i2sqFP+AafbE6AKfcL1y8jJnxRWaC8ZvIOTY55ctDO9FOxjt2Pt5HAhn03gqSxVY9oFKaWf8DUntYEUww+Gh4SAfKajwo31Eo76fMzLQU6SfqJiKvXctsWNkpExoXK0oux0YfZHU9Ir3LHDwoSvx+1wYcaSwdOzRwPLWKpOrpNat01yAcJxjjO9HaYjvC9+ZzTwMWjCAxjhJriK441z088t3R+kb3tjvEnacyuv9wnEQKv6/iJH8kuWwSv04V981aXwrjO7MYFrZDh8m7IjmNT9gbJj+tfVl1ojZTrHBTkHJlUBz6HLMZ7KEhU+GR6ivEPhaKOTFmRXV1gUV+pIco8EdnhzagsBlOSveMF5agPNbP7R/rIkB/jldNCsL877qmsWahaudgfM3Z5+Xurq1NSJhxf9lf87muOhX0GHvNG7biNbD7jH6wR2ZUhVlp/U6G/ZvRBk9ZUQz+Y5/S8r7mPgXy0is7m">(),
         true
      );
      this.IlIilIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","44H6copleasYqkfwdMn1aJPeE5KFqNqY+7Z5hjRbH2ENoK7A/wGCzvkVLE8=">(),
         IliIlllilIi<"IliIlllilIi","cuMpKscz95AJAhR03xDMyUP2+ZuS5CCbBgWjkg/sTL446u4t6BO2iN2R/HsBA+eK7X+EOaBkkXSZThO8lKaF9Vz/cwWv4GPgh+ke7CYeTdpM30qKjepGrOdcW7fr+NWUv3cytUcjJwbrWfilsSjlHGtpFqwCqTT5/4i5o1EZKX1iwqnzd+5TKbSo048C5ytDK/QJMEpOBstxEeQ9cQ2ZNEkRWniZxrSKCtNNUkFjJS64BRw1RztHaAdI3R9zEQe8JppBZiHuwYGTyZLLuvM7nrrSsqs/a9f4cBBITZgi+ImjoPT5nPtbwgockZaELxwa5nr+XWi1B+hsUe0jahaPUKHAOxpyf+yDuBhmQaY6XFXWU2urwdMaDmXcLAcNqPK8bZhhiM26oMxNQoAvB2xvjnvfP0PnOHa9EjQ4J/sqlgiq8u9RtAtSzfXcBKSX1AYLRaGSfKrVjfjNkb328DswsZw=">(),
         true
      );
      this.llIilIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","oXWg/Onhdf/uGY+C7bwfzmTMmuOxTW/sRMDhXrl1C95Dt3/XJhHE4Mfl">(),
         IliIlllilIi<"IliIlllilIi","uH/I/5XgevAZpvS7nW1Ek7RYjw9KVkLlGXucyzgDKg/VmRmqgjnzfB1hTHmjIeGhehWINH2Xcos3HpFxVLCWwGvqroX2WWYsOYbCh33Y5naym7vugP5KqNnAdd3cjGgCxmZczyFUymb+4MS6JGVircOXYtb1AALw0+cSRZXXABaWl/0Qi2A8s2gnGpcoBQk90r48i8H8vGKaztVphQoSr5VPIQjmH0Vlt8wgqk7LSarDhEBKtiho0MFW6R/COZ7fBqQQpFh8yhyEbxaBIKOZUzxqXXNzofiWAORQgMYVp3wyExRQnlnbFF197fR/DQVboJ/+dWp5Bf8ujA1sw0E5Zy0KvFfYCbxoMWtJlpa8aCd/qrQcWr+q+Nj6cmXgwpsSFjIZskPS+x6vWY9J9f6/TNw5rdVvAqxgdwX4Af3BP6G+kPWxHtx3lMzv+gxijE9Ifjk8gu09wm5GSdrlvlZ0PEG5X9fqFz1Yv12I2nnwHfPuGcfcUuGhrlcZ7Fh3zEZmX3pNCyWG4010jXBX4VGyyv0Qvfvtej6J">(),
         true
      );
      this.ilIilIlIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","d31NB3ItxwDWnU1LEgdlho6jMuaKy3X7mM2JqjPGNKWz9UvcjPlM8AuAV68c9GUxnWk=">(),
         IliIlllilIi<"IliIlllilIi","fD+aWCh/NKGQcXcamue0l9+K3SqRsbGeG83OowrK+NmSOCNf3tNNJ4rt/MrHH2C3ddal3OXFvNq3YdMWYK8cU97CQRYRi5DrdC3d3irFmiuq6vfrZ1DRISlj+RFj3cgdKtWbwRWlp9TaF2cwHyDmE/GBkzBX2TkPeBYkqQukMTOMuZT1RKlVdV2I5bPaj3E239P/KYto+6vyyOt9feHyhs5EWg1tKuUC69X/HPb706pC7F0qUD+Sn9RYbKxhqOgdC0pyHZ1L7n61YkW2gUU51PHRHQR7HMaVaRt3KmfIO42y3/umvYcddGhaFgntiSSYs0nTnFM05KftNNL1PoMoD1aH3K8u7Th3NHxsdcVktoUl">()
            .concat(
               IliIlllilIi<"IliIlllilIi","wLh0LoqzHyT46HgLJ8kZ76+9Pk0XGSnfu8pGO7qydTX2qltl5JJJb8hDFK5Hkfi9m0yAsiAJ6tCxhIKTKVIBFR4mifsFvZZ567AZt+R59cvidAkaqtYPraEIobjT3rqu2eG7ACQfE3DzG12HBKdxCyZ6+XYyXrZEFPhnRn7QVwhCyt2lRISDyGhENXwxvqrnd+ifR0Ov0gTvPsh/7JbRKENKJnZCNq9n+DHooNTk0lHH+EIEq7PNqfCIL5fzIrj/zhrAc1KoFGLr4qowFtREbdq0fvqLwWwBPRPhnr8QBZhdEc3tLIcxSmcwq4ETYD23fLEL6orwyaDQJwLwY8x/fcvErrHA9IDX+sB1jI0lbudHe8u+380YbTx+WvfvkHpbVuqzQaBJ7LqvWh8SLuF2hYtNaTAIjw==">()
            ),
         true
      );
      this.IiIilIlIIi = new Random();
      this.lililIlIIi = Integer.MIN_VALUE;
      this.IliilIlIIi = new IIiIlilIiIli(this.IiIilIlIIi);
      this.IiiilIlIIi = -1L;
      this.liiilIlIIi = -1L;
      this.iIlIiIlIIi = -1L;
      this.lllIiIlIIi = -1;
      this.illIiIlIIi = -1;
      this.iIiIiIlIIi = -1;
      this.IliIiIlIIi = Integer.MIN_VALUE;
      this.IiiIiIlIIi = Integer.MIN_VALUE;
      this.liiIiIlIIi = -1;
      this.lIIliIlIIi = new boolean[9];
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IlillIlIIi,
            this.llillIlIIi,
            this.ilillIlIIi,
            this.IiillIlIIi,
            this.liillIlIIi,
            this.iiillIlIIi,
            this.IIIilIlIIi,
            this.lIIilIlIIi,
            this.iIIilIlIIi,
            this.IlIilIlIIi,
            this.llIilIlIIi,
            this.ilIilIlIIi
         }
      );
   }

   public static synchronized boolean IIllllIlll(Object owner, BooleanSupplier restockGate) {
      return iIlllIllll(owner, restockGate, null);
   }

   private boolean Iiiilliiil() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      if (!var1.method_5438(40).method_31574(class_1802.field_8288) && this.lilliiilli() != -1) {
         return true;
      } else if (this.llillIlIIi.Iilllilliill() && this.illliIilli() != -1) {
         if (!var1.method_5438(this.IIililIili()).method_31574(class_1802.field_8288)) {
            return true;
         } else {
            for (int var2 = 0; var2 < 9; var2++) {
               if (this.lIIliIlIIi[var2] && var1.method_5438(var2).method_7960()) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   static int liilliiill(int fast, int deadline, int popTick, int tickCount) {
      return Math.min(fast, Math.max(popTick, deadline + tickCount));
   }
}
