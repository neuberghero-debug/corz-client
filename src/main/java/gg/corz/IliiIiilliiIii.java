package gg.corz;

import java.util.function.BooleanSupplier;

public final class IliiIiilliiIii {
   public static final int lIillIiIIl = 3;
   private final BooleanSupplier llillIiIIl;
   private final BooleanSupplier IlillIiIIl;
   private final Object iIillIiIIl;

   public void IliIlllilIi() {
      this.liiiIIllIl(false);
   }

   public void liiiIIllIl(boolean urgent) {
      if (IIIIilIilIIIilIi.iIlllIllll(this.iIillIiIIl, this.IlillIiIIl, this.llillIiIIl)) {
         if (urgent) {
            IIIIilIilIIIilIi.iilllIIill(this.iIillIiIIl, 3);
         }

         IIIIilIilIIIilIi var2 = IlIlllIlilIl();
         if (var2 != null) {
            var2.iIIilIlIil();
         }
      }
   }

   public void IilliliilIIi(IliIliIllliIliIl e) {
      if (e != null && IIIIilIilIIIilIi.Iillllilll(this.iIillIiIIl)) {
         IIIIilIilIIIilIi var2 = IlIlllIlilIl();
         if (var2 != null) {
            var2.IiIilliIil(e);
         }
      }
   }

   static BooleanSupplier IIIllIIliIIl(BooleanSupplier source, boolean fallback) {
      return () -> {
         if (source == null) {
            return fallback;
         } else {
            try {
               return source.getAsBoolean();
            } catch (Throwable var3) {
               return fallback;
            }
         }
      };
   }

   public void lIiiIiIlilli() {
      IIIIilIilIIIilIi.lllllillll(this.iIillIiIIl);
   }

   public IliiIiilliiIii(Object restockWindow, BooleanSupplier owner) {
      this(restockWindow, owner, null);
   }

   public void iIlIlllllill(IiIiIlIiliIiIlIi e) {
      if (e != null && IIIIilIilIIIilIi.Iillllilll(this.iIillIiIIl)) {
         IIIIilIilIIIilIi var2 = IlIlllIlilIl();
         if (var2 != null) {
            var2.llIililIil(e);
         }
      }
   }

   public IliiIiilliiIii(Object restockWindow, BooleanSupplier reserveOk, BooleanSupplier owner) {
      this.iIillIiIIl = restockWindow;
      this.IlillIiIIl = IIIllIIliIIl(reserveOk, true);
      this.llillIiIIl = owner == null ? null : IIIllIIliIIl(owner, false);
   }

   private static IIIIilIilIIIilIi IlIlllIlilIl() {
      return llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class) instanceof IIIIilIilIIIilIi var0 ? var0 : null;
   }

   public boolean iliIiiliiiii() {
      return IIIIilIilIIIilIi.Iillllilll(this.iIillIiIIl);
   }
}
