package gg.corz;

public final class IllllIllllllIl<T> {
   public final String ilIlilIllIiIlilIll;
   public final T lIIlilIlliIIlilIll;
   public final boolean iiiIilIllIIIlilIll;
   public final String IlIlilIllllIlilIll;

   static <T> IllllIllllllIl<T> IliIlllilIi(T v) {
      return new IllllIllllllIl<>(true, (T)v, null, null);
   }

   private IllllIllllllIl(boolean error, T message, String ok, String value) {
      this.iiiIilIllIIIlilIll = error;
      this.lIIlilIlliIIlilIll = (T)message;
      this.IlIlilIllllIlilIll = ok;
      this.ilIlilIllIiIlilIll = value;
   }

   static <T> IllllIllllllIl<T> liiiIIllIl(String error, String message) {
      return new IllllIllllllIl<>(false, null, error, message);
   }
}
