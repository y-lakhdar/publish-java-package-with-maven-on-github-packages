// TODO: to delete
import standardVersion from 'standard-version';

(async () => {
  await standardVersion({
    releaseCommitMessageFormat: 'chore(release): {{currentTag}} [skip-ci]',
    commitAll: true,
  }).catch((err) => {
    console.error(`standard-version failed with message: ${err.message}`);
  });
})();
