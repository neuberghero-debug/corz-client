package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public final class iiilIIiIIIiIIi {
   public static final int liiIliiliiiiIliili = 20;
   private static final class_2350[] iIIlliiliIlIlliili = class_2350.values();
   private String liiiliiliiiiiliili;
   private int illlliiliIillliili;
   private class_2338 iIliliiliIlliliili;
   private class_2338 Illlliilillllliili;
   private int Iililiililililiili;
   private int lillliiliiillliili;
   public static final int IliIliililliIliili = 6;
   private float Iiilliililiilliili;
   private long IlIiliilillIiliili;
   private boolean Iliiliililliiliili;
   private String iliiliiliIiiiliili;
   public static final float llIlliiliilIlliili = 0.7F;
   private int llliliiliilliliili;
   public static final String IIIlliililIIlliili = "breaking";
   private final lIliiliiIliili iiIlliiliIIllliili;
   private float llilliiliililliili;
   private long ilIiliiliIiIiliili;
   public static final float IiIlliililiIlliili = 1.15F;
   public static final double lIiIliiliiIiIliili = 4.5;
   private int lIIiliiliiIIiliili;
   private long liIiliiliiiIiliili;
   private class_243 iIilliiliIlilliili;
   private Object iiilliiliIIIiliili;
   public static final int iliIliiliIiiIliili = 3;
   private long IIliliililIliliili;
   private boolean lIiiliiliiIiiliili;
   private int iililiiliIIiiliili;
   private IliiIlllliiIll lIllliiliiIllliili = IliiIlllliiIll.IliIlllillliIlllil;
   private class_2350 IIilliililIilliili;

   private void iIIIlIlIIl(long t, String why) {
      this.iIliliiliIlliliili = this.Illlliilillllliili;
      this.IIliliililIliliili = t;
      this.llIIlilIIl();
      this.iliiliiliIiiiliili = null;
      this.liiiliiliiiiiliili = why;
   }

   public long Illillliilli() {
      return this.IIliliililIliliili;
   }

   public static boolean IliIlllilIi(float elapsed, float progress, int delta) {
      return !(elapsed + progress >= 1.0F) ? true : liiiIIllIl(progress, delta);
   }

   public class_2350 Iiilliiliiil() {
      return this.IIilliililIilliili;
   }

   public void Iilllilliill() {
      long var4 = -3626829731802535585L;
      var4 ^= ((long)(this.lIllliiliiIllliili != IliiIlllliiIll.liiIllliliiiIlllil && !this.lIiiliiliiIiiliili ? 0 : 1) << 32 ^ var4) & -1L << 32;
      long var2 = this.iiIlliiliIIllliili.liiiIIllIl();
      this.llIIlilIIl();
      this.lIiiliiliiIiiliili = false;
      if ((int)(var4 >>> 32) != 0) {
         if (this.iiIlliiliIIllliili.Illillliilli()
            && this.ilIiliiliIiIiliili != var2
            && this.liIiliiliiiIiliili != var2
            && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = var2;
            this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","ZuRoNeC1acMy7fh78IIe5LwgcUfcVCwvz3KTksVMk4dx5ov01R4C">();
         } else if (this.iiIlliiliIIllliili.Illillliilli()) {
            this.lIiiliiliiIiiliili = true;
         }
      }
   }

   private iiIlIlIlIIllIlIl IIIIllIIIl(String why) {
      this.llIIlilIIl();
      this.iliiliiliIiiiliili = why;
      this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","VZbX41azPd7HnqN9W1AGtQidbZLfPS1cvFKjf8qnK3N9">() + why;
      return iiIlIlIlIIllIlIl.IiIlliilIl;
   }

   public class_2338 Ililllililil() {
      return this.Illlliilillllliili;
   }

   public String Iiiiliiiiiii() {
      String var1 = this.liiiliiliiiiiliili;
      this.liiiliiliiiiiliili = null;
      return var1;
   }

   public boolean IiIlliIliiIl() {
      return this.lIllliiliiIllliili != IliiIlllliiIll.IliIlllillliIlllil;
   }

   public int IlIillIiilIi() {
      return this.llliliiliilliliili;
   }

   public class_243 IIIilIIiiIIi() {
      return this.iIilliiliIlilliili;
   }

   public long IIiilIiiiIii() {
      return this.liIiliiliiiIiliili;
   }

   public iiilIIiIIIiIIi(lIliiliiIliili io) {
      this.illlliiliIillliili = -1;
      this.lIIiliiliiIIiliili = -1;
      this.IlIiliilillIiliili = Long.MIN_VALUE;
      this.ilIiliiliIiIiliili = Long.MIN_VALUE;
      this.liIiliiliiiIiliili = Long.MIN_VALUE;
      this.IIliliililIliliili = Long.MIN_VALUE;
      this.iiIlliiliIIllliili = io;
   }

   public iiIlIlIlIIllIlIl lIiiIiIlilli() {
      long var1 = this.iiIlliiliIIllliili.liiiIIllIl();
      if (this.lIiiliiliiIiiliili) {
         if (this.iiIlliiliIIllliili.Illillliilli()) {
            if (this.ilIiliiliIiIiliili != var1 && this.liIiliiliiiIiliili != var1 && this.iiIlliiliIIllliili.Iiilliiliiil()) {
               this.iiIlliiliIIllliili.IIiilIiiiIii();
               this.lIiiliiliiIiiliili = false;
               this.ilIiliiliIiIiliili = var1;
               this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","ZuRoNeC1acMy7fh78IIe5LwgcUfcVCwvz3KTksVMk4dx5ov01R4C">();
               return iiIlIlIlIIllIlIl.llIlliilIl;
            }

            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }

         this.lIiiliiliiIiiliili = false;
      }

      if (this.lIllliiliiIllliili == IliiIlllliiIll.IliIlllillliIlllil) {
         return iiIlIlIlIIllIlIl.iiiIliilIl;
      } else if (!this.iiIlliiliIIllliili.IliIlllilIi()) {
         return this.IIIIllIIIl(IiIIlliIIl<"IiIIlliIIl","e+31yI7J/uEI5d74ahn1SORMlNqRaIXXwQmrVcVwhIlr">());
      } else if (this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili)) {
         this.iIIIlIlIIl(
            var1,
            this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil
               ? IiIIlliIIl<"IiIIlliIIl","yyGH9v5mnJSt1N+ksLf/Tt8C7pddlUR0z3cmwUTwgA==">()
               : IiIIlliIIl<"IiIIlliIIl","8sAc8rz1g7Xoe+zz3Ys4YlVbEvk+XObKkLmqKwwkAv8=">()
         );
         return iiIlIlIlIIllIlIl.ilIlliilIl;
      } else {
         return this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil ? this.IIIllIIliIIl(var1) : this.iliIiiliiiii(var1);
      }
   }

   public static boolean liiiIIllIl(float delta, int elapsed) {
      return delta * (float)(Math.max(0, elapsed) + 1) >= 0.80499995F;
   }

   public void IIillIiliIil() {
      long var2 = -7058433240419212295L;
      var2 ^= ((long)(this.lIllliiliiIllliili != IliiIlllliiIll.liiIllliliiiIlllil && !this.lIiiliiliiIiiliili ? 0 : 1) << 32 ^ var2) & -1L << 32;
      this.llIIlilIIl();
      this.lIiiliiliiIiiliili = false;
      if ((int)(var2 >>> 32) != 0 && this.iiIlliiliIIllliili.IliIlllilIi() && this.iiIlliiliIIllliili.Illillliilli()) {
         this.iiIlliiliIIllliili.IIiilIiiiIii();
         this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","Z8T7tD6wViYiuFOHwBG7cWrbNMS6pftKQcL01gT5N10SRI5eWLY=">();
      }

      this.ilIiliiliIiIiliili = Long.MIN_VALUE;
      this.liIiliiliiiIiliili = Long.MIN_VALUE;
      this.IIliliililIliliili = Long.MIN_VALUE;
      this.iIliliiliIlliliili = null;
   }

   private iiIlIlIlIIllIlIl IIIllIIliIIl(long t) {
      this.iiIlliiliIIllliili.IIillIiliIil(this.llilliiliililliili, this.Iiilliililiilliili);
      this.llliliiliilliliili++;
      String var3 = null;
      if (!this.iiIlliiliIIllliili.Illillliilli()) {
         var3 = IiIIlliIIl<"IiIIlliIIl","dZD08T7pCIDdQQ0c1rkc56gSijwiMAs7+3tJ95FFoTo=">();
      } else if (this.iiIlliiliIIllliili.IlIillIiilIi() != this.lIIiliiliiIIiliili || !this.iiIlliiliIIllliili.IIlilIliiIli(this.iiilliiliIIIiliili)) {
         var3 = IiIIlliIIl<"IiIIlliIIl","Lnb4qMiQWXW7FiOjCecu3wXjyVjvwCHOJllAHJp4K1SO">();
      } else if (this.iiIlliiliIIllliili.IilliliilIIi()) {
         var3 = IiIIlliIIl<"IiIIlliIIl","FyeSleUE2t6WaupxZVRB/feK3YWr9YKu/UfGwluItedW">();
      } else if (this.iiIlliiliIIllliili.IIIllIIliIIl(this.Illlliilillllliili) > 4.5) {
         var3 = IiIIlliIIl<"IiIIlliIIl","yt6LOgaI3vIpfdL1TnMaRHOJBWuqxqqX0LynyoDGQHnU">();
      } else if (!this.iiIlliiliIIllliili
         .IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, this.iiIlliiliIIllliili.IIlllIlliIll(), this.iiIlliiliIIllliili.Illlllllilll())) {
         var3 = IiIIlliIIl<"IiIIlliIIl","Wl5WFhaI/IOoOmaT9gEbMnXKj25aaAUL60VkMRxRbw==">();
      } else if (this.llliliiliilliliili > this.lillliiliiillliili + 20) {
         var3 = IiIIlliIIl<"IiIIlliIIl","BGbC+8r5hnlEFgYkjTUfMc6PvL6FxKYdAKJUptkXCCg=">();
      }

      if (var3 != null) {
         if (IiIIlliIIl<"IiIIlliIIl","dZD08T7pCIDdQQ0c1rkc56gSijwiMAs7+3tJ95FFoTo=">().equals(var3)) {
            this.IlIlllIlilIl(IiIIlliIIl<"IiIIlliIIl","dZD08T7pCIDdQQ0c1rkc56gSijwiMAs7+3tJ95FFoTo=">());
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else if (this.liIiliiliiiIiliili != t && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = t;
            this.IlIlllIlilIl(var3);
            return ++this.iililiiliIIiiliili >= 3 ? this.IIIIllIIIl(var3) : iiIlIlIlIIllIlIl.llIlliilIl;
         } else {
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }
      } else if (!this.iiIlliiliIIllliili.Iiilliiliiil()) {
         return iiIlIlIlIIllIlIl.lIIlliilIl;
      } else if (!this.iiIlliiliIIllliili.Iliilliiilii(this.Illlliilillllliili, (int)Math.min(2147483647L, t - this.IlIiliilillIiliili))) {
         if (!this.Iliiliililliiliili) {
            this.Iliiliililliiliili = true;
            this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","HIXZgkMU2jbQfpF/anraFvFa1EZTqdvn4rYbBvnI094=">();
         }

         return iiIlIlIlIIllIlIl.IlIlliilIl;
      } else {
         this.iiIlliiliIIllliili.Iilililiiili(this.Illlliilillllliili, this.IIilliililIilliili);
         this.liIiliiliiiIiliili = t;
         if (!this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili) && this.iiIlliiliIIllliili.Illillliilli()) {
            return iiIlIlIlIIllIlIl.IlIlliilIl;
         } else {
            this.iIIIlIlIIl(t, IiIIlliIIl<"IiIIlliIIl","yyGH9v5mnJSt1N+ksLf/Tt8C7pddlUR0z3cmwUTwgA==">());
            return iiIlIlIlIIllIlIl.ilIlliilIl;
         }
      }
   }

   public class_2338 Iilililiiili() {
      return this.iIliliiliIlliliili;
   }

   public boolean IilliliilIIi(class_2338 toolSlot, int expectTicks, int target) {
      if (this.lIllliiliiIllliili == IliiIlllliiIll.IliIlllillliIlllil && toolSlot != null) {
         this.llIIlilIIl();
         this.iliiliiliIiiiliili = null;
         this.Illlliilillllliili = toolSlot.method_10062();
         this.illlliiliIillliili = expectTicks;
         this.lillliiliiillliili = Math.max(0, target);
         this.lIllliiliiIllliili = IliiIlllliiIll.iliIlllilIiiIlllil;
         return true;
      } else {
         return false;
      }
   }

   public boolean IIlllIlliIll() {
      return this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil || this.lIiiliiliiIiiliili;
   }

   public int IIlilIliiIli() {
      return this.illlliiliIillliili;
   }

   private void IlIlllIlilIl(String why) {
      this.lIllliiliiIllliili = IliiIlllliiIll.iliIlllilIiiIlllil;
      this.Iliiliililliiliili = false;
      this.IIilliililIilliili = null;
      this.iiilliiliIIIiliili = null;
      this.lIIiliiliiIIiliili = -1;
      this.llliliiliilliliili = 0;
      this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","VZbX41azPd7HnqN9W1AGtQidbZLfPS1cvFKjf8qnK3N9">() + why;
   }

   public int IiIiliIiiiIi() {
      return this.lillliiliiillliili;
   }

   public String Iliilliiilii() {
      return this.iliiliiliIiiiliili;
   }

   public static iiilIIiIIIiIIi iIlIlllllill(lilllllliillllll gates, illillIlIilillIl host) {
      return new iiilIIiIIIiIIi(new llIliiiilIliii(gates, host));
   }

   private iiIlIlIlIIllIlIl iliIiiliiiii(long t) {
      if (this.iiIlliiliIIllliili.Illillliilli()) {
         if (this.ilIiliiliIiIiliili != t && this.liIiliiliiiIiliili != t && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = t;
            this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","lVL89q/pX1xk8oeI9FgNKRhiQK3E0qpsvR40RPdSNcWNFoi/v1g=">();
            return iiIlIlIlIIllIlIl.llIlliilIl;
         } else {
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }
      } else if (this.ilIiliiliIiIiliili == t || this.liIiliiliiiIiliili == t) {
         return iiIlIlIlIIllIlIl.lIIlliilIl;
      } else if (this.iiIlliiliIIllliili.IilliliilIIi()) {
         return iiIlIlIlIIllIlIl.lIIlliilIl;
      } else if (this.iiIlliiliIIllliili.iliIiiliiiii(this.Illlliilillllliili)) {
         return this.IIIIllIIIl(IiIIlliIIl<"IiIIlliIIl","47GnePwgpvm8zGJJ2sdF7nezHQdF//AskGIrHj9v3bTnVE0=">());
      } else if (this.iiIlliiliIIllliili.IIIllIIliIIl(this.Illlliilillllliili) > 4.5) {
         return this.IIIIllIIIl(IiIIlliIIl<"IiIIlliIIl","yt6LOgaI3vIpfdL1TnMaRHOJBWuqxqqX0LynyoDGQHnU">());
      } else {
         float var3 = this.iiIlliiliIIllliili.IIlllIlliIll();
         float var4 = this.iiIlliiliIIllliili.Illlllllilll();
         if (this.IIilliililIilliili == null || !this.iiIlliiliIIllliili.IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, var3, var4)) {
            IIIIiiIllIIIiiIl var5 = this.iiIlliiliIIllliili.IlIlllIlilIl(this.Illlliilillllliili, var3, var4);
            if (var5 == null) {
               if (++this.Iililiililililiili >= 6) {
                  return this.IIIIllIIIl(IiIIlliIIl<"IiIIlliIIl","yRZk9sB8oIeGhmve6UrlgZ6jTPRCxbGCfXqXFmeAFQ==">());
               }

               if (this.iIilliiliIlilliili != null) {
                  this.iiIlliiliIIllliili.Iilllilliill(this.iIilliiliIlilliili);
               }

               return iiIlIlIlIIllIlIl.IIIlliilIl;
            }

            this.IIilliililIilliili = var5.IliIlllilIi();
            this.iIilliiliIlilliili = var5.liiiIIllIl();
         }

         this.Iililiililililiili = 0;
         if (!this.iiIlliiliIIllliili.IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, var3, var4)) {
            this.iiIlliiliIIllliili.Iilllilliill(this.iIilliiliIlilliili);
            return iiIlIlIlIIllIlIl.IIIlliilIl;
         } else if (!this.iiIlliiliIIllliili.iIlIlllllill() && this.lillliiliiillliili > 0) {
            this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else if (!this.iiIlliiliIIllliili.Ililllililil()) {
            this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else if (this.illlliiliIillliili >= 0 && !this.iiIlliiliIIllliili.IIIilIIiiIIi(this.illlliiliIillliili)) {
            this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else {
            this.iiIlliiliIIllliili.Iilililiiili(this.Illlliilillllliili, this.IIilliililIilliili);
            this.liIiliiliiiIiliili = t;
            this.llilliiliililliili = var3;
            this.Iiilliililiilliili = var4;
            this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
            if (this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili)) {
               this.iIIIlIlIIl(t, IiIIlliIIl<"IiIIlliIIl","yyGH9v5mnJSt1N+ksLf/Tt8C7pddlUR0z3cmwUTwgA==">());
               return iiIlIlIlIIllIlIl.ilIlliilIl;
            } else if (!this.iiIlliiliIIllliili.Illillliilli()) {
               return iiIlIlIlIIllIlIl.lIIlliilIl;
            } else {
               this.lIllliiliiIllliili = IliiIlllliiIll.liiIllliliiiIlllil;
               this.IlIiliilillIiliili = t;
               this.iiilliiliIIIiliili = this.iiIlliiliIIllliili.IiIiliIiiiIi();
               this.lIIiliiliiIIiliili = this.iiIlliiliIIllliili.IlIillIiilIi();
               this.llliliiliilliliili = 0;
               this.liiiliiliiiiiliili = IiIIlliIIl<"IiIIlliIIl","8BSltylldJSm9z4ReVFw2PcYKRnE3HUKkVN20vX+hA==">();
               return iiIlIlIlIIllIlIl.iIIlliilIl;
            }
         }
      }
   }

   public IliiIlllliiIll Illlllllilll() {
      return this.lIllliiliiIllliili;
   }

   private void llIIlilIIl() {
      this.lIllliiliiIllliili = IliiIlllliiIll.IliIlllillliIlllil;
      this.Illlliilillllliili = null;
      this.illlliiliIillliili = -1;
      this.lillliiliiillliili = 0;
      this.IIilliililIilliili = null;
      this.iIilliiliIlilliili = null;
      this.iiilliiliIIIiliili = null;
      this.lIIiliiliiIIiliili = -1;
      this.IlIiliilillIiliili = Long.MIN_VALUE;
      this.llliliiliilliliili = 0;
      this.Iililiililililiili = 0;
      this.iililiiliIIiiliili = 0;
      this.Iliiliililliiliili = false;
   }
}
