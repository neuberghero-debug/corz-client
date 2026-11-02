package gg.corz;

public final class iIIlIiIlIlIi<T> {
   public final T lIIiiiiiiIIiiiii;
   public final String IlIiiiiillIiiiii;
   public final boolean iiiliiiiIIIiiiii;

   public static <T> iIIlIiIlIlIi<T> liiiIIllIl(String error) {
      return new iIIlIiIlIlIi<>(false, null, error);
   }

   private iIIlIiIlIlIi(boolean value, T error, String ok) {
      this.iiiliiiiIIIiiiii = value;
      this.lIIiiiiiiIIiiiii = (T)error;
      this.IlIiiiiillIiiiii = ok;
   }

   public static <T> iIIlIiIlIlIi<T> IliIlllilIi(T v) {
      return new iIIlIiIlIlIi<>(true, (T)v, null);
   }
}
